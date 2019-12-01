package com.github.foodbox_project.model.user.confirmation_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class CodePurpose {

    private Integer id;
    private String name;

    private List<ConfirmationCode> confirmationCodes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ConfirmationCode> getConfirmationCodes() {
        if (confirmationCodes == null) {
            confirmationCodes = new ArrayList<>();
        }
        return confirmationCodes;
    }

    public void setConfirmationCodes(List<ConfirmationCode> confirmationCodes) {
        this.confirmationCodes = confirmationCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodePurpose)) return false;
        CodePurpose that = (CodePurpose) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
