package com.github.foodbox_project.model.restaurant.hours.hours;

import com.github.foodbox_project.model.restaurant.hours.day_of_week.DayOfWeek;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class HoursException {

    private Integer id;
    private DayOfWeek day;
    private Timestamp opens;
    private Timestamp closes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public Timestamp getOpens() {
        return opens;
    }

    public void setOpens(Timestamp opens) {
        this.opens = opens;
    }

    public Timestamp getCloses() {
        return closes;
    }

    public void setCloses(Timestamp closes) {
        this.closes = closes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HoursException)) return false;
        HoursException that = (HoursException) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
