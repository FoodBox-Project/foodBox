package com.github.foodbox_project.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AllItemTypesDto {

    private List<ItemTypeDto> itemTypes;
    private long pageCount;
}
