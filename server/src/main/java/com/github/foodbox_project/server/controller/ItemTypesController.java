package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dto.ItemTypeDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item-types")
@RequiredArgsConstructor
public class ItemTypesController {

    private final IItemTypeService itemTypeService;

    @GetMapping
    public Response<List<ItemTypeDto>> getTypes() {
        return new Response<>(itemTypeService.getAll());
    }
}
