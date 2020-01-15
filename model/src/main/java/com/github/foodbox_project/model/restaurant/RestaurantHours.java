package com.github.foodbox_project.model.restaurant;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "restaurant_hours")
@Getter
@Setter
public class RestaurantHours extends AEntity {

    @Column(name = "regular_opens")
    private LocalDate regularOpens;
    @Column(name = "regular_closes")
    private LocalDate regularCloses;

//    private List<HoursException> exceptions;
//
//    public List<HoursException> getExceptions() {
//        if (exceptions == null) {
//            exceptions = new ArrayList<>();
//        }
//        return exceptions;
//    }
}
