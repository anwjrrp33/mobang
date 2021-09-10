package com.mobang.component;

import com.mobang.entity.RealEstate;
import com.mobang.repository.RealEstateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestData implements CommandLineRunner {

    private final RealEstateRepository realEstateRepository;

    @Override
    public void run(String... args) throws Exception {
        for(int i = 1; i <= 10; i++) {
            RealEstate realEstate = new RealEstate()
                    .builder()
                    .address("서울시 강서구 가양동 " + i + "번지")
                    .build();

            realEstateRepository.save(realEstate);
        }
    }
}
