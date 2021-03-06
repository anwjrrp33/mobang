package com.mobang.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class RealEstate extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    private String address;

    private Long area;

    private Long salePrice;
}
