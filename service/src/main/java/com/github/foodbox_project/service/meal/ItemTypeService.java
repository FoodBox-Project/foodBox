package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemTypeRepository;
import com.github.foodbox_project.dto.AllItemTypesDto;
import com.github.foodbox_project.dto.ItemTypeDto;
import com.github.foodbox_project.model.meal.ItemType;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ItemTypeService extends GenericService<ItemType, Long> implements IItemTypeService {

    private final ItemTypeRepository itemTypeRepository;
    private final ModelMapper modelMapper;

    @Override
    public AllItemTypesDto getAll(int start, int limit) {
        validate(start, limit); // todo move to ValidationService validatePagination(start, limit);
        Pageable pageable = PageRequest.of(start, limit);
        List<ItemTypeDto> itemTypes = itemTypeRepository.findAll(pageable).stream()
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

    private void validate(int start, int limit) {
        if (start < 0 || limit < 1) {
            log.warn("Illegal Arguments: page number {}, page size {}", start, limit);
            throw new IllegalArgumentException("Illegal pagination arguments");
        }
    }
}
