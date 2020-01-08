package com.github.foodbox_project.model.user;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.address.Country;
import com.github.foodbox_project.model.chat.Chat;
import com.github.foodbox_project.model.chat.Message;
import com.github.foodbox_project.model.meal.RestaurantItem;
import com.github.foodbox_project.model.order.Order;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends AEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "photo_url")
    private String photoUrl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Email email;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private PhoneNumber phone;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;
    @OneToMany(mappedBy = "owner")
    private List<ConfirmationCode> confirmationCodes;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_favourites", joinColumns = {
            @JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "restaurant_item_id", referencedColumnName = "id")
            })
    private List<RestaurantItem> favouriteItems;

    public List<Order> getOrders() {
        if (orders==null){
            orders = new ArrayList<>();
        }
        return orders;
    }

    public List<ConfirmationCode> getConfirmationCodes() {
        if (confirmationCodes==null){
            confirmationCodes = new ArrayList<>();
        }
        return confirmationCodes;
    }

    public List<RestaurantItem> getFavouriteItems() {
        if (favouriteItems==null){
            favouriteItems = new ArrayList<>();
        }
        return favouriteItems;
    }
}
