package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.api.service.restaurant.IRestaurantService;
import com.github.foodbox_project.dto.meal.AllItemTypesDto;
import com.github.foodbox_project.dto.restaurant.RestaurantDto;
import com.github.foodbox_project.dto.restaurant.RestaurantFullInfoDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
@RequiredArgsConstructor
@Slf4j
public class RestaurantController {

    private final IRestaurantService restaurantService;
    private final IItemTypeService itemTypeService;

    @GetMapping
    public Response<List<RestaurantDto>> getRestaurants() {
        return new Response<>(restaurantService.getAll());
    }

    @GetMapping("/{id}")
    public Response<RestaurantFullInfoDto> getRestaurantFullInfo(@PathVariable Long id) {
        return new Response<>(restaurantService.getFullInfo(id));
    }

    @GetMapping("/{id}/item-types")
    public Response<AllItemTypesDto> getRestaurantItemTypes(@RequestParam(value = "start", defaultValue = "0") int start,
                                                             @RequestParam(value = "limit", defaultValue = "4") int limit,
                                                             @PathVariable Long id) {
        return new Response<>(itemTypeService.getRestaurantItemTypes(start, limit, id));
    }

    @PostMapping
    public Response<RestaurantDto> addRestaurant(@RequestBody RestaurantDto request) {
        log.info("save Restaurant request received: {}", request);
        return new Response<>(restaurantService.save(request));
    }
}
