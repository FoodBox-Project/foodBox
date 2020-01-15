package com.github.foodbox_project.model.address;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "cities")
@Getter
@Setter
public class City extends AEntity {

    @Column(name = "name")
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
}
