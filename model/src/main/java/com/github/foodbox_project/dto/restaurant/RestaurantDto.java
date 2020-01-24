package com.github.foodbox_project.dto.restaurant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantDto {

    private Long id;
    private String name;
    private String phoneNumber;
    private String description;
    private String photoUrl;
}
