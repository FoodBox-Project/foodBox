package com.github.foodbox_project.dto.meal;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data

public class ItemTypeDto {

    private Long id;
    private String name;
    private String description;
    @JsonInclude(Include.NON_NULL)
    private Long restaurantId;
}
