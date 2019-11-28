package com.github.foodbox_project.model.meal.meal;

import com.github.foodbox_project.model.meal.dimension.Dimension;
import com.github.foodbox_project.model.order.order.Order;
import com.github.foodbox_project.model.restaurant.restaurant.Restaurant;
import com.github.foodbox_project.model.user.user.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class RestaurantItem {

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Timestamp getServeStart() {
        return serveStart;
    }

    public void setServeStart(Timestamp serveStart) {
        this.serveStart = serveStart;
    }

    public Timestamp getServeUntil() {
        return serveUntil;
    }

    public void setServeUntil(Timestamp serveUntil) {
        this.serveUntil = serveUntil;
    }

    public List<User> getFavouriteSelectors() {
        if (favouriteSelectors==null){
            favouriteSelectors = new ArrayList<>();
        }
        return favouriteSelectors;
    }

    public void setFavouriteSelectors(List<User> favouriteSelectors) {
        this.favouriteSelectors = favouriteSelectors;
    }

    public List<Order> getOrdersWherePresented() {
        if (ordersWherePresented==null){
            ordersWherePresented = new ArrayList<>();
        }
        return ordersWherePresented;
    }

    public void setOrdersWherePresented(List<Order> ordersWherePresented) {
        this.ordersWherePresented = ordersWherePresented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestaurantItem)) return false;
        RestaurantItem that = (RestaurantItem) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
