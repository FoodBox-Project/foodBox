package com.github.foodbox_project.service.meal;

import com.github.foodbox_project.api.service.meal.IItemService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.meal.ItemRepository;
import com.github.foodbox_project.dto.meal.ItemDto;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService extends GenericService<Item, Long> implements IItemService {

    private final ItemRepository itemRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ItemDto> getByCategoryId(Long categoryId) {
        List<Item> items = itemRepository.getByCategoryId(categoryId);
        return items.stream()
                .map(item -> modelMapper.map(item, ItemDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ItemDto getItemById(Long itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Entity with id: %d not found", itemId)));

        return modelMapper.map(item, ItemDto.class);
    }

    @Override
    protected GenericRepository<Item, Long> getDao() {
        return itemRepository;
    }
}
