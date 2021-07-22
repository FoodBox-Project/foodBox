package com.github.foodbox_project.dto.address;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDto {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String abbreviation;
}
