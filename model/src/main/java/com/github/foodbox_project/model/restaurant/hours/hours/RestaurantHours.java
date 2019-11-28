package com.github.foodbox_project.model.restaurant.hours.hours;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class RestaurantHours {

    private Integer id;
    private Timestamp regularOpens;
    private Timestamp regularCloses;

    private List<HoursException> exceptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getRegularOpens() {
        return regularOpens;
    }

    public void setRegularOpens(Timestamp regularOpens) {
        this.regularOpens = regularOpens;
    }

    public Timestamp getRegularCloses() {
        return regularCloses;
    }

    public void setRegularCloses(Timestamp regularCloses) {
        this.regularCloses = regularCloses;
    }

    public List<HoursException> getExceptions() {
        if (exceptions==null){
            exceptions = new ArrayList<>();
        }
        return exceptions;
    }

    public void setExceptions(List<HoursException> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestaurantHours)) return false;
        RestaurantHours that = (RestaurantHours) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
