package com.github.foodbox_project.model.restaurant;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.model.order.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Restaurant extends AEntity {

    private String name;
    private RestaurantAddress address;
    private String email;
    private String phoneNumber;
    private String description;
    private String photoUrl;
    private RestaurantHours hours;

    private List<Item> items;
    private List<Order> orders;

    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public List<Order> getOrders() {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        return orders;
    }
}
