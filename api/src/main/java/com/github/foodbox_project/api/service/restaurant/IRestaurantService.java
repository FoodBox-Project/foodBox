package com.github.foodbox_project.api.service.restaurant;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.restaurant.RestaurantDto;
import com.github.foodbox_project.dto.restaurant.RestaurantFullInfoDto;
import com.github.foodbox_project.model.restaurant.Restaurant;

import java.util.List;

public interface IRestaurantService extends IGenericService<Restaurant, Long> {

    List<RestaurantDto> getAll();

    RestaurantFullInfoDto getFullInfo(Long id);

    RestaurantDto save(RestaurantDto restaurantDto);
}
