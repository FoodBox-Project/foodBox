package com.github.foodbox_project.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@EqualsAndHashCode
@MappedSuperclass
public abstract class AEntity {

    @Getter
    @Setter
    private Long id;
}
