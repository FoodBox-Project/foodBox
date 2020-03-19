package com.github.foodbox_project.dal.restaurant;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.restaurant.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends GenericRepository<Restaurant, Long> {

    @Query("select r from Restaurant r " +
            "left join fetch r.address a " +
            "left join fetch a.city c " +
            "left join fetch c.country country " +
            "left join fetch r.hours " +
            "where r.id = :id")
    Restaurant getFullInfo(@Param("id") Long id);
}
