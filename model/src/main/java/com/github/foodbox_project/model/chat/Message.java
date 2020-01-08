package com.github.foodbox_project.model.chat;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.user.User;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Message extends AEntity {

    private User sender;
    private Chat chat;
    private String text;
    private Timestamp date;
}
