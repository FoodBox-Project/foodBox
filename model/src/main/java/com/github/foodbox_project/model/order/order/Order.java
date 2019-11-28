package com.github.foodbox_project.model.order.order;

import com.github.foodbox_project.model.meal.meal.Item;
import com.github.foodbox_project.model.order.status.RestaurantStatus;
import com.github.foodbox_project.model.order.status.UserStatus;
import com.github.foodbox_project.model.restaurant.restaurant.Restaurant;
import com.github.foodbox_project.model.user.user.User;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Order {

    private Integer id;
    private Restaurant restaurant;
    private User user;
    private Timestamp date;
    private RestaurantStatus restaurantStatus;
    private UserStatus userStatus;

    private List<Item> itemList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public RestaurantStatus getRestaurantStatus() {
        return restaurantStatus;
    }

    public void setRestaurantStatus(RestaurantStatus restaurantStatus) {
        this.restaurantStatus = restaurantStatus;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getId().equals(order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
