package com.github.foodbox_project.dto.meal;

import lombok.Data;

@Data
public class ItemCategoryDto {

    private Long id;
    private String name;
    private String description;
    private Long itemTypeId;
}
