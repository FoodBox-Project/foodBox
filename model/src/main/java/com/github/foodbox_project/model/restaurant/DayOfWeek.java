package com.github.foodbox_project.model.restaurant;

import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class DayOfWeek {

    private Integer id;
    private String name;

    private List<HoursException> hoursExceptionList;

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

    public List<HoursException> getHoursExceptionList() {
        return hoursExceptionList;
    }

    public void setHoursExceptionList(List<HoursException> hoursExceptionList) {
        this.hoursExceptionList = hoursExceptionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DayOfWeek)) return false;
        DayOfWeek dayOfWeek = (DayOfWeek) o;
        return getId().equals(dayOfWeek.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
