package com.github.foodbox_project.model.chat;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.user.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Chat extends AEntity {

    private String topic;

    private List<User> users;
    private List<Message> messages;

    public List<User> getUsers() {
        if (users == null) {
            users = new ArrayList<>();
        }
        return users;
    }

    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<>();
        }
        return messages;
    }
}
