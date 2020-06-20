package com.github.foodbox_project.dto.meal;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ItemDto {

    private Long id;
    private String name;
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long itemCategoryId;
}
