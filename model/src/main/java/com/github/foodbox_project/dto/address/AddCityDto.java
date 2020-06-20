package com.github.foodbox_project.dto.address;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class AddCityDto {

    @NotNull
    private String name;
    private Long countryId;
}
