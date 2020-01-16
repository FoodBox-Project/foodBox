package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemTypeService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemTypeRepository;
import com.github.foodbox_project.model.meal.ItemType;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemTypeService extends GenericService<ItemType, Long> implements IItemTypeService {

    private final ItemTypeRepository itemTypeRepository;

    @Override
    protected GenericRepository<ItemType, Long> getDao() {
        return itemTypeRepository;
    }
}
