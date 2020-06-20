package com.github.foodbox_project.api.service.meal;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.meal.ItemCategoryDto;
import com.github.foodbox_project.model.meal.ItemCategory;

import java.util.List;

public interface IItemCategoryService extends IGenericService<ItemCategory, Long> {

    List<ItemCategoryDto> getByItemTypeId(Long typeId);

    ItemCategoryDto save(ItemCategoryDto request);
}
