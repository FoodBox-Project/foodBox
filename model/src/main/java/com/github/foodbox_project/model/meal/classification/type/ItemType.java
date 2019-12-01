package com.github.foodbox_project.model.meal.classification.type;

import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class ItemType {

    private Integer id;
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemType)) return false;
        ItemType itemType = (ItemType) o;
        return getId().equals(itemType.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
