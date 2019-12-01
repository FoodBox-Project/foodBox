package com.github.foodbox_project.model.chat.message;

import com.github.foodbox_project.model.chat.chat.Chat;
import com.github.foodbox_project.model.user.user.User;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Message {

    private Integer id;
    private User sender;
    private Chat chat;
    private String text;
    private Timestamp date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return getId().equals(message.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
