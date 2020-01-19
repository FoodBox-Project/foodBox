package com.github.foodbox_project.api.service.meal;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.AllItemTypesDto;
import com.github.foodbox_project.model.meal.ItemType;

public interface IItemTypeService extends IGenericService<ItemType, Long> {

    AllItemTypesDto getAll(int start, int limit);
}
