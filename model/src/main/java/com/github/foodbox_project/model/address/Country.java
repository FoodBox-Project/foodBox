package com.github.foodbox_project.model.address;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country extends AEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "abbreviation")
    private String abbreviation;
}
