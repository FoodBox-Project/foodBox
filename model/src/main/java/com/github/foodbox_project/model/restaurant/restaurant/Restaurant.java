package com.github.foodbox_project.model.restaurant.restaurant;

import com.github.foodbox_project.model.meal.meal.Item;
import com.github.foodbox_project.model.order.order.Order;
import com.github.foodbox_project.model.restaurant.address.RestaurantAddress;
import com.github.foodbox_project.model.restaurant.hours.hours.RestaurantHours;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Restaurant {

    private Integer id;
    private String name;
    private RestaurantAddress address;
    private String email;
    private String phoneNumber;
    private String description;
    private String photoUrl;
    private RestaurantHours hours;

    private List<Item> items;
    private List<Order> orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestaurantAddress getAddress() {
        return address;
    }

    public void setAddress(RestaurantAddress address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public RestaurantHours getHours() {
        return hours;
    }

    public void setHours(RestaurantHours hours) {
        this.hours = hours;
    }

    public List<Item> getItems() {
        if (items==null){
            items = new ArrayList<>();
        }
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Order> getOrders() {
        if (orders==null){
            orders = new ArrayList<>();
        }
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant)) return false;
        Restaurant that = (Restaurant) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
