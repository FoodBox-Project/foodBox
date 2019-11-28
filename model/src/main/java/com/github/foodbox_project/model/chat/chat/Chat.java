package com.github.foodbox_project.model.chat.chat;

import com.github.foodbox_project.model.chat.message.Message;
import com.github.foodbox_project.model.user.user.User;

import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Chat {

    private Integer id;
    private String topic;

    private List<User> users;
    private List<Message> messages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat)) return false;
        Chat chat = (Chat) o;
        return getId().equals(chat.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
