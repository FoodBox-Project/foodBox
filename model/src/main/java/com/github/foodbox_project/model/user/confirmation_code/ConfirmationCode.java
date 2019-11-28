package com.github.foodbox_project.model.user.confirmation_code;

import com.github.foodbox_project.model.user.user.User;

import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class ConfirmationCode {

    private Integer id;
    private User owner;
    private String code;
    private CodePurpose codePurpose;
    private SentOption sentTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CodePurpose getCodePurpose() {
        return codePurpose;
    }

    public void setCodePurpose(CodePurpose codePurpose) {
        this.codePurpose = codePurpose;
    }

    public SentOption getSentTo() {
        return sentTo;
    }

    public void setSentTo(SentOption sentTo) {
        this.sentTo = sentTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConfirmationCode)) return false;
        ConfirmationCode that = (ConfirmationCode) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
