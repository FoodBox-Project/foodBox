package com.github.foodbox_project.service.address;

import com.github.foodbox_project.api.service.address.ICountryService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.address.CountryRepository;
import com.github.foodbox_project.dto.address.CountryDto;
import com.github.foodbox_project.model.address.Country;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CountryService extends GenericService<Country, Long> implements ICountryService {

    private final CountryRepository countryRepository;
    private final ModelMapper modelMapper;

    @Override
    public CountryDto save(CountryDto request) {
        Country country = modelMapper.map(request, Country.class);
        countryRepository.save(country);
        return modelMapper.map(country, CountryDto.class);
    }

    @Override
    protected GenericRepository<Country, Long> getDao() {
        return countryRepository;
    }
}
