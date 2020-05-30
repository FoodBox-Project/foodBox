package com.github.foodbox_project.model.meal;

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
@Table(name = "item_categories")
@Getter
@Setter
public class ItemCategory extends AEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type")
    private ItemType type;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
