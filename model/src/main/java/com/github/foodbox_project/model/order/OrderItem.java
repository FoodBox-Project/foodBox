package com.github.foodbox_project.model.order;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.meal.RestaurantItem;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders_items")
@Getter
@Setter
public class OrderItem extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private RestaurantItem item;
    @Column(name = "quantity")
    private Long quantity;

}
