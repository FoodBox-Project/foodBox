package com.github.foodbox_project.service.restaurant;

import com.github.foodbox_project.api.service.restaurant.IRestaurantService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.restaurant.RestaurantRepository;
import com.github.foodbox_project.model.restaurant.Restaurant;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantService extends GenericService<Restaurant, Long> implements IRestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Override
    protected GenericRepository<Restaurant, Long> getDao() {
        return restaurantRepository;
    }
}
