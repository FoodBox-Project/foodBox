package com.github.foodbox_project.model.restaurant;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.address.City;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Address extends AEntity {

    private City city;
    private String address;

}
