package com.github.foodbox_project.service.restaurant;

import com.github.foodbox_project.api.service.restaurant.IRestaurantService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.restaurant.RestaurantRepository;
import com.github.foodbox_project.dto.restaurant.RestaurantDto;
import com.github.foodbox_project.dto.restaurant.RestaurantFullInfoDto;
import com.github.foodbox_project.model.restaurant.Restaurant;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantService extends GenericService<Restaurant, Long> implements IRestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<RestaurantDto> getAll() {
        return restaurantRepository.findAll().stream()
                .map(restaurant -> modelMapper.map(restaurant, RestaurantDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public RestaurantFullInfoDto getFullInfo(Long id) {
        Restaurant restaurant = restaurantRepository.getFullInfo(id);
        return modelMapper.map(restaurant, RestaurantFullInfoDto.class);
    }

    @Override
    protected GenericRepository<Restaurant, Long> getDao() {
        return restaurantRepository;
    }
}
