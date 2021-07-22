package com.github.foodbox_project.api.service.meal;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.meal.AllItemTypesDto;
import com.github.foodbox_project.dto.meal.ItemTypeDto;
import com.github.foodbox_project.model.meal.ItemType;

public interface IItemTypeService extends IGenericService<ItemType, Long> {

    AllItemTypesDto getRestaurantItemTypes(int start, int limit, Long restaurantId);

    ItemTypeDto save(ItemTypeDto request);
}
