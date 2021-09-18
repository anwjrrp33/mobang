package com.mobang.service;

import com.mobang.entity.RealEstate;
import com.mobang.repository.RealEstateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class RealEstateServiceTest {
    @Autowired
    private RealEstateService realEstateService;

    @Test
    public void registerTest() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            RealEstate realEstate = RealEstate.builder()
                    .address("서울시 강서구 가양동 " + i + "번지")
                    .area(Long.valueOf(i))
                    .salePrice(Long.valueOf(i * 100000000))
                    .build();
            System.out.println(realEstateService.resigter(realEstate));
        });
    }

    @Test
    public void getListTest() {
        System.out.println(realEstateService.getList());
    }

}
