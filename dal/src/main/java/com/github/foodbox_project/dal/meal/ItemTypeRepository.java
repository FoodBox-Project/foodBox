package com.github.foodbox_project.dal.meal;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.meal.ItemType;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTypeRepository extends GenericRepository<ItemType, Long> {
}
