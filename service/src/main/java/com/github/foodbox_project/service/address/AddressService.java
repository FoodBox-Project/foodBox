package com.github.foodbox_project.service.address;

import com.github.foodbox_project.api.service.address.IAddressService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.address.AddressRepository;
import com.github.foodbox_project.dal.address.CityRepository;
import com.github.foodbox_project.dto.address.AddAddressDto;
import com.github.foodbox_project.dto.address.AddressDto;
import com.github.foodbox_project.model.address.Address;
import com.github.foodbox_project.model.address.City;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AddressService extends GenericService<Address, Long> implements IAddressService {

    private final AddressRepository addressRepository;
    private final CityRepository cityRepository;
    private final ModelMapper modelMapper;

    @Override
    public AddressDto save(AddAddressDto request) {
        City city = cityRepository.getOne(request.getCityId());
        Address address = modelMapper.map(request, Address.class);
        address.setCity(city);
        return modelMapper.map(address, AddressDto.class);
    }

    @Override
    protected GenericRepository<Address, Long> getDao() {
        return addressRepository;
    }
}
