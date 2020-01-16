package com.github.foodbox_project.dal.meal;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.meal.ItemCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCategoryRepository extends GenericRepository<ItemCategory, Long> {
}
