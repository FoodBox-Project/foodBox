package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemCategoryService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemCategoryRepository;
import com.github.foodbox_project.dto.meal.ItemCategoryDto;
import com.github.foodbox_project.model.meal.ItemCategory;
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
public class ItemCategoryService extends GenericService<ItemCategory, Long> implements IItemCategoryService {

    private final ItemCategoryRepository itemCategoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ItemCategoryDto> getByItemTypeId(Long typeId) {
        List<ItemCategory> itemCategories = itemCategoryRepository.getByTypeId(typeId);
        return itemCategories.stream()
                .map(category -> modelMapper.map(category, ItemCategoryDto.class))
                .collect(Collectors.toList());
    }

    @Override
    protected GenericRepository<ItemCategory, Long> getDao() {
        return itemCategoryRepository;
    }
}
