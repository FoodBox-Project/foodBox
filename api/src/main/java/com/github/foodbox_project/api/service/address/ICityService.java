package com.github.foodbox_project.api.service.address;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.address.AddCityDto;
import com.github.foodbox_project.dto.address.CityDto;
import com.github.foodbox_project.model.address.City;

public interface ICityService extends IGenericService<City, Long> {

    CityDto save(AddCityDto request);
}
