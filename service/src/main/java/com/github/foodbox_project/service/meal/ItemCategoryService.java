package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemCategoryService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemCategoryRepository;
import com.github.foodbox_project.model.meal.ItemCategory;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemCategoryService extends GenericService<ItemCategory, Long> implements IItemCategoryService {

    private final ItemCategoryRepository itemCategoryRepository;

    @Override
    protected GenericRepository<ItemCategory, Long> getDao() {
        return itemCategoryRepository;
    }
}
