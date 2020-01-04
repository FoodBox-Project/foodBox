package com.github.foodbox_project.model.user;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.chat.Chat;
import com.github.foodbox_project.model.chat.Message;
import com.github.foodbox_project.model.meal.RestaurantItem;
import com.github.foodbox_project.model.order.Order;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class User extends AEntity {

    private String firstName;
    private String lastName;
    private UserRole userRole;
    private Timestamp birthday;
    private String photoUrl;

    private List<Chat> chats;
    private List<Message> messages;
    private List<Order> orders;
    private List<ConfirmationCode> confirmationCodes;
    private List<RestaurantItem> favouriteItems;

    public List<Chat> getChats() {
        if (chats==null){
            chats = new ArrayList<>();
        }
        return chats;
    }

    public List<Message> getMessages() {
        if (messages==null){
            messages = new ArrayList<>();
        }
        return messages;
    }

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
