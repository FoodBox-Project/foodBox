package com.github.foodbox_project.server.controller;

import com.github.foodbox_project.api.service.address.IAddressService;
import com.github.foodbox_project.dto.address.AddAddressDto;
import com.github.foodbox_project.dto.address.AddressDto;
import com.github.foodbox_project.server.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

    private final IAddressService addressService;

    @PostMapping
    public Response<AddressDto> addAddress(@RequestBody AddAddressDto request) {
        log.info("save Address request received: {}", request);
        return new Response<>(addressService.save(request));
    }
}
