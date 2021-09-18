package com.mobang.service;

import com.mobang.entity.RealEstate;
import com.mobang.repository.RealEstateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class RealEstateServiceImpl implements RealEstateService{

    private final RealEstateRepository repository;

    @Override
    public Long resigter(RealEstate realEstate) {
        repository.save(realEstate);
        return realEstate.getId();
    }

    @Override
    public List<RealEstate> getList() {
        List<RealEstate> result = repository.findAll();
        return result;
    }
}
