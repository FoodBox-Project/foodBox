package com.github.foodbox_project.model.address;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Country extends AEntity {

    private String name;
    private String abbreviation;
    private String phoneCode;
}
