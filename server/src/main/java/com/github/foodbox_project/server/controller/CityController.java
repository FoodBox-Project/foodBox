package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.address.ICityService;
import com.github.foodbox_project.dto.address.AddCityDto;
import com.github.foodbox_project.dto.address.CityDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
@Slf4j
public class CityController {

    private final ICityService cityService;

    @PostMapping
    public Response<CityDto> addCity(@RequestBody AddCityDto request) {
        log.info("save City request received: {}", request);
        return new Response<>(cityService.save(request));
    }
}
