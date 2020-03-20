package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemService;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.dto.meal.ItemDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final IItemService itemService;
    private final ModelMapper modelMapper;

    @GetMapping("/{id}")
    public Response<ItemDto> getById(@PathVariable Long id) {
        Item item = itemService.getById(id);
        return new Response<>(modelMapper.map(item, ItemDto.class));
    }

}
