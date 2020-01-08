package com.github.foodbox_project.model.meal;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Item extends AEntity {

    private String name;
    private String description;
    private ItemCategory category;
}
