package com.github.foodbox_project.model.order;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.model.restaurant.Restaurant;
import com.github.foodbox_project.model.user.User;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Order extends AEntity {

    private Restaurant restaurant;
    private User user;
    private Timestamp date;
    private RestaurantStatus restaurantStatus;
    private UserStatus userStatus;

    private List<Item> items;

    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }
}
