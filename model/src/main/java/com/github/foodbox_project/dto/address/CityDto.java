package com.github.foodbox_project.dto.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityDto {

    private Long id;
    private String name;
    private CountryDto country;
}
