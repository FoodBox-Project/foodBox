package com.github.foodbox_project.api.service.address;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.address.AddAddressDto;
import com.github.foodbox_project.dto.address.AddressDto;
import com.github.foodbox_project.model.address.Address;

public interface IAddressService extends IGenericService<Address, Long> {

    AddressDto save(AddAddressDto request);
}
