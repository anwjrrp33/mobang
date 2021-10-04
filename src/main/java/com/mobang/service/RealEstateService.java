package com.mobang.service;

import com.mobang.entity.RealEstate;

import java.util.List;

public interface RealEstateService {

    Long resigter(RealEstate realEstate);
    List<RealEstate> getList();
    RealEstate getDetail(Long id);
}
