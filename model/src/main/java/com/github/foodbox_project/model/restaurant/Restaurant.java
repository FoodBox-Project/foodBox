package com.github.foodbox_project.model.restaurant;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.meal.Item;
import com.github.foodbox_project.model.meal.RestaurantItem;
import com.github.foodbox_project.model.order.Order;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "restaurants")
@Getter
@Setter
public class Restaurant extends AEntity {

    @Column(name = "name")
    private String name;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "description")
    private String description;
    @Column(name = "photo_url")
    private String photoUrl;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_hours")
    private RestaurantHours hours;
    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantItem> items;
    @OneToMany(mappedBy = "restaurant")
    private List<Order> orders;

    public List<RestaurantItem> getItems() {
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
