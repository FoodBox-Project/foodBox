package com.github.foodbox_project.model.user;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class ConfirmationCode extends AEntity {

    private User owner;
    private String code;
    private String codePurpose;
    private SentOption sentTo;
}
