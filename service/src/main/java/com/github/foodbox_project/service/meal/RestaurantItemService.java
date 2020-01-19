package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IRestaurantItemService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.RestaurantItemRepository;
import com.github.foodbox_project.model.meal.RestaurantItem;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantItemService extends GenericService<RestaurantItem, Long> implements IRestaurantItemService {

    private final RestaurantItemRepository restaurantItemRepository;

    @Override
    protected GenericRepository<RestaurantItem, Long> getDao() {
        return restaurantItemRepository;
    }
}
