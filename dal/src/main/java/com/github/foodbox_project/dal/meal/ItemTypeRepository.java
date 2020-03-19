package com.github.foodbox_project.dal.meal;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.meal.ItemType;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemTypeRepository extends GenericRepository<ItemType, Long> {

    List<ItemType> getByRestaurantId(Pageable pageable, Long restaurantId);
}
