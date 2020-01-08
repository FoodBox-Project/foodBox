package com.github.foodbox_project.model.meal;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.order.Order;
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
public class RestaurantItem extends AEntity {

    private Integer id;
    private Item item;
    private Restaurant restaurant;
    private Double price;
    //TODO create currency!!!
    private Double size;
    private Dimension dimension;
    private Timestamp serveStart;
    private Timestamp serveUntil;

    private List<User> favouriteSelectors;
    private List<Order> ordersWherePresented;

    public List<User> getFavouriteSelectors() {
        if (favouriteSelectors == null) {
            favouriteSelectors = new ArrayList<>();
        }
        return favouriteSelectors;
    }

    public List<Order> getOrdersWherePresented() {
        if (ordersWherePresented == null) {
            ordersWherePresented = new ArrayList<>();
        }
        return ordersWherePresented;
    }
}
