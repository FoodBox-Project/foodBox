package com.github.foodbox_project.dto.restaurant;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class RestaurantDto {

    private Long id;
    private String name;
    private String phoneNumber;
    private String description;
    private String photoUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long addressId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long restaurantHoursId;
}
