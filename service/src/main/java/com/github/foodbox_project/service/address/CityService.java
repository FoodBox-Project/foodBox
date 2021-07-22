package com.github.foodbox_project.service.address;

import com.github.foodbox_project.api.service.address.ICityService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.address.CityRepository;
import com.github.foodbox_project.dal.address.CountryRepository;
import com.github.foodbox_project.dto.address.AddCityDto;
import com.github.foodbox_project.dto.address.CityDto;
import com.github.foodbox_project.model.address.City;
import com.github.foodbox_project.model.address.Country;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CityService extends GenericService<City, Long> implements ICityService {

    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;
    private final ModelMapper modelMapper;

    @Override
    public CityDto save(AddCityDto request) {
        Country country = countryRepository.getOne(request.getCountryId());
        City city = modelMapper.map(request, City.class);
        city.setCountry(country);
        cityRepository.save(city);
        return modelMapper.map(city, CityDto.class);
    }

    @Override
    protected GenericRepository<City, Long> getDao() {
        return cityRepository;
    }
}
