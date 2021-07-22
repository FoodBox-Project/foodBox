package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemService;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.dto.meal.ItemDto;
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

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
@Slf4j
public class ItemController {

    private final IItemService itemService;
    private final ModelMapper modelMapper;

    @GetMapping("/{id}")
    public Response<ItemDto> getById(@PathVariable Long id) {
        ItemDto item = itemService.getItemById(id);
        return new Response<>(item);
    }

    @PostMapping
    public Response<ItemDto> addItem(@RequestBody ItemDto request) {
        log.info("save Item request received: {}", request);
        Item item = modelMapper.map(request, Item.class);
        itemService.save(item);
        return new Response<>(modelMapper.map(item, ItemDto.class));
    }
}
