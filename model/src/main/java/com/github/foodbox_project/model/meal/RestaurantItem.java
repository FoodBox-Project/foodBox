package com.github.foodbox_project.model.meal;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.order.Order;
import com.github.foodbox_project.model.restaurant.Restaurant;
import com.github.foodbox_project.model.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "restaurant_items")
@Getter
@Setter
public class RestaurantItem extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @Column(name = "price")
    private Double price;
    @Column(name = "size")
    private Double size;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dimension_id")
    private Dimension dimension;
    @Column(name = "serve_start")
    private LocalDate serveStart;
    @Column(name = "serve_until")
    private LocalDate serveUntil;
    @ManyToMany(mappedBy = "favouriteItems")
    private List<User> favouriteSelectors;

    public List<User> getFavouriteSelectors() {
        if (favouriteSelectors == null) {
            favouriteSelectors = new ArrayList<>();
        }
        return favouriteSelectors;
    }
}
