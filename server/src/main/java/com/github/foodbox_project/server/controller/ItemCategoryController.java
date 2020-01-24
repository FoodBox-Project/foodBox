package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemService;
import com.github.foodbox_project.dto.meal.ItemDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item-categories")
@RequiredArgsConstructor
public class ItemCategoryController {

    private final IItemService itemService;

    @GetMapping("/{id}/items")
    public Response<List<ItemDto>> getCategoryItems(@PathVariable Long id) {
        return new Response<>(itemService.getByCategoryId(id));
    }
}
