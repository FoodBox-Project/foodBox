package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemTypeRepository;
import com.github.foodbox_project.dto.ItemTypeDto;
import com.github.foodbox_project.model.meal.ItemType;
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
public class ItemTypeService extends GenericService<ItemType, Long> implements IItemTypeService {

    private final ItemTypeRepository itemTypeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ItemTypeDto> getAll() {
        return itemTypeRepository.findAll().stream()
                .map(item -> modelMapper.map(item, ItemTypeDto.class))
                .collect(Collectors.toList());
    }
    @Override
    protected GenericRepository<ItemType, Long> getDao() {
        return itemTypeRepository;
    }
}
