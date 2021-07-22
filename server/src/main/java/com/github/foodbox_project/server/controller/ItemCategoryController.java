package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemCategoryService;
import com.github.foodbox_project.api.service.meal.IItemService;
import com.github.foodbox_project.dto.meal.ItemCategoryDto;
import com.github.foodbox_project.dto.meal.ItemDto;
import com.github.foodbox_project.model.meal.ItemCategory;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item-categories")
@RequiredArgsConstructor
@Slf4j
public class ItemCategoryController {

    private final IItemService itemService;
    private final IItemCategoryService itemCategoryService;

    @GetMapping("/{id}/items")
    public Response<List<ItemDto>> getCategoryItems(@PathVariable Long id) {
        return new Response<>(itemService.getByCategoryId(id));
    }

    @PostMapping
    public Response<ItemCategoryDto> addItemCategory(@RequestBody ItemCategoryDto request) {
        log.info("save ItemCategory request received: {}", request);
        return new Response<>(itemCategoryService.save(request));
    }
}
