package com.github.foodbox_project.model.restaurant;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class HoursException extends AEntity {

    private DayOfWeek day;
    private Timestamp opens;
    private Timestamp closes;

}
