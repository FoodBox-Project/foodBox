package com.github.foodbox_project.dal;

import com.github.foodbox_project.model.meal.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
}
