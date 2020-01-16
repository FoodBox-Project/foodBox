package com.github.foodbox_project.dal.meal;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.meal.RestaurantItem;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantItemRepository extends GenericRepository<RestaurantItem, Long> {
}
