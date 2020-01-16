package com.github.foodbox_project.api.service.meal;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.ItemTypeDto;
import com.github.foodbox_project.model.meal.ItemType;

import java.util.List;

public interface IItemTypeService extends IGenericService<ItemType, Long> {

    List<ItemTypeDto> getAll();
}
