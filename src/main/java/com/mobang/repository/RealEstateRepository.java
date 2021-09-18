package com.mobang.repository;

import com.mobang.entity.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RealEstateRepository extends JpaRepository<RealEstate, Long>,
        QuerydslPredicateExecutor<RealEstate> {
}
