package com.github.foodbox_project.dto.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    private Long id;
    private String address;
    private CityDto city;
}
