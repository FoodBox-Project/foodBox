package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemCategoryService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemCategoryRepository;
import com.github.foodbox_project.dal.meal.ItemTypeRepository;
import com.github.foodbox_project.dto.meal.ItemCategoryDto;
import com.github.foodbox_project.exceptions.ServiceException;
import com.github.foodbox_project.model.meal.ItemCategory;
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
public class ItemCategoryService extends GenericService<ItemCategory, Long> implements IItemCategoryService {

    private final ItemCategoryRepository itemCategoryRepository;
    private final ItemTypeRepository itemTypeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ItemCategoryDto> getByItemTypeId(Long typeId) {
        List<ItemCategory> itemCategories = itemCategoryRepository.getByTypeId(typeId);
        return itemCategories.stream()
                .map(category -> modelMapper.map(category, ItemCategoryDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ItemCategoryDto save(ItemCategoryDto itemCategoryDto) {
        ItemCategory itemCategory = modelMapper.map(itemCategoryDto, ItemCategory.class);
        fillItemType(itemCategory, itemCategoryDto.getItemTypeId());
        save(itemCategory);
        return modelMapper.map(itemCategory, ItemCategoryDto.class);
    }

    @Override
    protected GenericRepository<ItemCategory, Long> getDao() {
        return itemCategoryRepository;
    }

    private void fillItemType(ItemCategory itemCategory, Long itemTypeId) {
        if (itemTypeId != null) {
            ItemType itemType = itemTypeRepository
                    .findById(itemTypeId)
                    .orElseThrow(() -> new ServiceException("Wrong item type id"));
            itemCategory.setType(itemType);
        }
    }
}
