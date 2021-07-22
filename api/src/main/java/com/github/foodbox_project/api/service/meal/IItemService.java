package com.github.foodbox_project.api.service.meal;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.meal.ItemDto;
import com.github.foodbox_project.model.meal.Item;

import java.util.List;

public interface IItemService extends IGenericService<Item, Long> {

    List<ItemDto> getByCategoryId(Long categoryId);
    ItemDto getItemById(Long id);
}
