package com.github.foodbox_project.api.service.address;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dto.address.CountryDto;
import com.github.foodbox_project.model.address.Country;

public interface ICountryService extends IGenericService<Country, Long> {

    CountryDto save(CountryDto request);
}
