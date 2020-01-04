package com.github.foodbox_project.model.restaurant;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class RestaurantHours extends AEntity {

    private Timestamp regularOpens;
    private Timestamp regularCloses;

    private List<HoursException> exceptions;

    public List<HoursException> getExceptions() {
        if (exceptions == null) {
            exceptions = new ArrayList<>();
        }
        return exceptions;
    }
}
