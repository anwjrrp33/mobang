package com.mobang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MobangApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobangApplication.class, args);
	}

	/**************************  M E M O  ******************
	 *  2021-09018 QueryDSL 적용하였으므로 하기 내용 실행 요함  *
	 *  1. gradle refresh 실행                              *
	 *  2. gradle > build > clean 실행                      *
	 *  3. gradle > querydsl > cleanQuerydslSource 실행     *
	 *  4. gradle > querydsl > initQuerydslSource 실행      *
	 *  5. gradle > build > build 실행                      *
	 *******************************************************/

}
