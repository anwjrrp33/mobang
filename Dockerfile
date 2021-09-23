# step 1 툴에서 그래들 빌드 파일 복사해서 실행
# FROM openjdk:11-jre-slim
# EXPOSE 8000
# ARG JAR_FILE=./build/libs/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java", "-jar", "/app.jar"]


# 도커파일 내에서 그래들 빌드 후 실행
# FROM openjdk:11 AS builder
# COPY gradlew .
# COPY gradle gradle
# COPY build.gradle .
# COPY settings.gradle .
# COPY src src
# RUN apt-get update && apt-get install -y dos2unix
# RUN dos2unix gradlew
# RUN chmod +x gradlew
# RUN ./gradlew clean bootJar
# COPY ./build/libs/*.jar app.jar
# EXPOSE 8000
# ENTRYPOINT ["java", "-jar", "/app.jar"]

# 멀티스테이징을 이용해서 파일 용량 줄이기
FROM openjdk:11 AS builder
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN apt-get update && apt-get install -y dos2unix
RUN dos2unix gradlew
RUN chmod +x gradlew
RUN ./gradlew clean
RUN ./gradlew cleanQuerydslSourcesDir
RUN ./gradlew initQuerydslSourcesDir
RUN ./gradlew querydslClasses
RUN ./gradlew bootJar

FROM openjdk:11
COPY --from=builder ./build/libs/*.jar app.jar

EXPOSE 8000
ENTRYPOINT ["java", "-jar", "/app.jar"]

## 실행했던 주요 명령어
## docker run -d --name db -e MYSQL_ROOT_PASSWORD=mobang1234~! -p 3306:3306 --network testmobang mysql
## docker build --no-cache -t spring-docker .
## docker run -it -p 8000:8000 --link db:db --network testmobang --name spring-docker spring-docker bash