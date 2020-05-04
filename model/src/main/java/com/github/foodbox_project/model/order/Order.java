package com.github.foodbox_project.model.order;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.restaurant.Restaurant;
import com.github.foodbox_project.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "restaurant_status")
    @Enumerated(EnumType.STRING)
    private RestaurantStatus restaurantStatus;
    @Column(name = "user_status")
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @OneToMany(mappedBy = OrderItem_.ORDER)
    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        if (orderItems == null) {
            orderItems = new ArrayList<>();
        }
        return orderItems;
    }
}
