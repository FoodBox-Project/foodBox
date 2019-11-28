package com.github.foodbox_project.model.meal.dimension;

import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Dimension {

    private Integer id;
    private String name;
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dimension)) return false;
        Dimension dimension = (Dimension) o;
        return getId().equals(dimension.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
