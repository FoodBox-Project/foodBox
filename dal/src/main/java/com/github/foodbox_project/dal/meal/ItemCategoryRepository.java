package com.github.foodbox_project.dal.meal;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.meal.ItemCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemCategoryRepository extends GenericRepository<ItemCategory, Long> {

    List<ItemCategory> getByTypeId(Long typeId);
}
