package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemCategoryService;
import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dto.meal.ItemCategoryDto;
import com.github.foodbox_project.dto.meal.ItemTypeDto;
import com.github.foodbox_project.model.meal.ItemType;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item-types")
@RequiredArgsConstructor
@Slf4j
public class ItemTypesController {

    private final IItemCategoryService itemCategoryService;
    private final IItemTypeService itemTypeService;

    @GetMapping("{id}/categories")
    public Response<List<ItemCategoryDto>> getItemTypeCategories(@PathVariable Long id) {
        return new Response<>(itemCategoryService.getByItemTypeId(id));
    }

    @PostMapping
    public Response<ItemTypeDto> addItemType(@RequestBody ItemTypeDto request) {
        log.info("save ItemType request received: {}", request);
        return new Response<>(itemTypeService.save(request));
    }
}
