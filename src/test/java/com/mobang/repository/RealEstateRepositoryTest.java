package com.mobang.repository;

import com.mobang.entity.RealEstate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class RealEstateRepositoryTest {
    @Autowired
    private RealEstateRepository realEstateRepository;

    @Test
    public void insertDummies() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            RealEstate realEstate = RealEstate.builder()
                    .address("서울시 강서구 가양동 " + i + "번지")
                    .area(Long.valueOf(i))
                    .salePrice(Long.valueOf(i * 100000000))
                    .build();
            System.out.println(realEstateRepository.save(realEstate));
        });
    }

}
