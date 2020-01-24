package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.IValidationService;
import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemTypeRepository;
import com.github.foodbox_project.dto.meal.AllItemTypesDto;
import com.github.foodbox_project.dto.meal.ItemTypeDto;
import com.github.foodbox_project.model.meal.ItemType;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemTypeService extends GenericService<ItemType, Long> implements IItemTypeService {

    private final ItemTypeRepository itemTypeRepository;
    private final ModelMapper modelMapper;
    private final IValidationService validationService;

    @Override
    public AllItemTypesDto getRestaurantItemTypes(int start, int limit, Long restaurantId) {
        validationService.validatePagination(start, limit);
        Pageable pageable = PageRequest.of(start, limit);
        List<ItemTypeDto> itemTypes = itemTypeRepository.getByRestaurantId(pageable, restaurantId).stream()
                .map(item -> modelMapper.map(item, ItemTypeDto.class))
                .collect(Collectors.toList());
        AllItemTypesDto response = new AllItemTypesDto();
        response.setItemTypes(itemTypes);
        response.setPageCount(countPages(limit));
        return response;
    }

    @Override
    protected GenericRepository<ItemType, Long> getDao() {
        return itemTypeRepository;
    }
}
