package com.mobang.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RealEstateDTO {
    private Long id;
    private String address;
    private Long area;
    private Long salePrice;
}
