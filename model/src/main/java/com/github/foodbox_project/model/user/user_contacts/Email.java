package com.github.foodbox_project.model.user.user_contacts;


import com.github.foodbox_project.model.user.user.User;

import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Email {

    private Integer id; //ownerId
    private String email;
    private Boolean isConfirmed;
    private Boolean isSubscribed;

    private User owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        isConfirmed = confirmed;
    }

    public Boolean getSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        isSubscribed = subscribed;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email email = (Email) o;
        return getId().equals(email.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
