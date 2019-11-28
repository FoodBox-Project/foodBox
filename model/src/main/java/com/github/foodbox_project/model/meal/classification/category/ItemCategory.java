package com.github.foodbox_project.model.meal.classification.category;

import com.github.foodbox_project.model.meal.classification.type.ItemType;

import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class ItemCategory {

    private Integer id;
    private ItemType type;
    private String name;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
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
        if (!(o instanceof ItemCategory)) return false;
        ItemCategory that = (ItemCategory) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
