package com.github.foodbox_project.model.meal;

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
@Table(name = "item_types")
@Getter
@Setter
public class ItemType extends AEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
