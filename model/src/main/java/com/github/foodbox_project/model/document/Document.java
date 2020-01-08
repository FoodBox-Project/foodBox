package com.github.foodbox_project.model.document;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Getter
@Setter
public class Document extends AEntity {

    private String name;
    private Blob content;
    private Double version;

}
