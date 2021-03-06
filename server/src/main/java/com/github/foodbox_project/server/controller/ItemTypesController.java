package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemCategoryService;
import com.github.foodbox_project.dto.meal.ItemCategoryDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item-types")
@RequiredArgsConstructor
public class ItemTypesController {

    private final IItemCategoryService itemCategoryService;

    @GetMapping("{id}/categories")
    public Response<List<ItemCategoryDto>> getItemTypeCategories(@PathVariable Long id) {
        return new Response<>(itemCategoryService.getByItemTypeId(id));
    }
}
