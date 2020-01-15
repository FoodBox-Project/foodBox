package com.github.foodbox_project.model.document;

import com.github.foodbox_project.model.AEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Blob;

/**
 * Created by earthofmarble on Nov, 2019
 */

@Entity
@Table(name = "documents")
@Getter
@Setter
public class Document extends AEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "content")
    private Blob content;
    @Column(name = "version")
    private Double version;

}
