package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemRepository;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService extends GenericService<Item, Long> implements IItemService {

    private final ItemRepository itemRepository;

    @Override
    protected GenericRepository<Item, Long> getDao() {
        return itemRepository;
    }
}
