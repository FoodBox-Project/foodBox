package com.github.foodbox_project.model.user.user;

import com.github.foodbox_project.model.chat.chat.Chat;
import com.github.foodbox_project.model.chat.message.Message;
import com.github.foodbox_project.model.meal.meal.RestaurantItem;
import com.github.foodbox_project.model.order.order.Order;
import com.github.foodbox_project.model.user.confirmation_code.ConfirmationCode;
import com.github.foodbox_project.model.user.role.UserRole;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class User {

    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public List<Chat> getChats() {
        if (chats==null){
            chats = new ArrayList<>();
        }
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public List<Message> getMessages() {
        if (messages==null){
            messages = new ArrayList<>();
        }
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
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

    public List<ConfirmationCode> getConfirmationCodes() {
        if (confirmationCodes==null){
            confirmationCodes = new ArrayList<>();
        }
        return confirmationCodes;
    }

    public void setConfirmationCodes(List<ConfirmationCode> confirmationCodes) {
        this.confirmationCodes = confirmationCodes;
    }

    public List<RestaurantItem> getFavouriteItems() {
        if (favouriteItems==null){
            favouriteItems = new ArrayList<>();
        }
        return favouriteItems;
    }

    public void setFavouriteItems(List<RestaurantItem> favouriteItems) {
        this.favouriteItems = favouriteItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
