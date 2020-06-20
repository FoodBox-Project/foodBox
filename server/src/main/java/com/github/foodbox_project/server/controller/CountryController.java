package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.address.ICountryService;
import com.github.foodbox_project.dto.address.CountryDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
@Slf4j
public class CountryController {

    private final ICountryService countryService;

    @PostMapping
    public Response<CountryDto> addCountry(@RequestBody @Valid CountryDto request) {
        log.info("save Country request received: {}", request);
        return new Response<>(countryService.save(request));
    }
}
