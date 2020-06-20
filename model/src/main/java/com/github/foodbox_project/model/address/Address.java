package com.github.foodbox_project.model.address;

import com.github.foodbox_project.model.AEntity;
import com.github.foodbox_project.model.address.City;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "addresses")
@Getter
@Setter
public class Address extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;
    @Column(name = "address")
    private String address;

}
