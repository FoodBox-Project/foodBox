package com.github.foodbox_project.dal.restaurant;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.restaurant.Restaurant;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends GenericRepository<Restaurant, Long> {
}
