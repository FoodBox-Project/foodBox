package com.github.foodbox_project.model.document;

import com.github.foodbox_project.model.user.user.User;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class UserConfirmedDocument {

    private Integer id;
    private Document document;
    private User user;
    private Timestamp confirmationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Timestamp confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserConfirmedDocument)) return false;
        UserConfirmedDocument that = (UserConfirmedDocument) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
