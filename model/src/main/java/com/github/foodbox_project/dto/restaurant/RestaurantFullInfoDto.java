package com.github.foodbox_project.dto.restaurant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantFullInfoDto extends RestaurantDto {

    private String email;
    private AddressDto address;
    private RestaurantHoursDto hours;
}
