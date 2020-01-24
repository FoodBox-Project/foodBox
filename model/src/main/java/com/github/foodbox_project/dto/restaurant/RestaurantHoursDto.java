package com.github.foodbox_project.dto.restaurant;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
public class RestaurantHoursDto {

    private Time regularOpens;
    private Time regularCloses;
}
