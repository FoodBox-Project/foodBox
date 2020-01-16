package com.github.foodbox_project.dal.meal;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.meal.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends GenericRepository<Item, Long> {
}
