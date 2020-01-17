package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dto.AllItemTypesDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-types")
@RequiredArgsConstructor
public class ItemTypesController {

    private final IItemTypeService itemTypeService;

    @GetMapping
    public Response<AllItemTypesDto> getTypes(@RequestParam(value = "start", defaultValue = "0") int start,
                                              @RequestParam(value = "limit", defaultValue = "4") int limit) { // todo move limit defaultValue to properties
        return new Response<>(itemTypeService.getAll(start, limit));
    }
}
