package com.github.foodbox_project.model.document;

import java.sql.Blob;
import java.util.Objects;

/**
 * Created by earthofmarble on Nov, 2019
 */

public class Document {

    private Integer id;
    private String name;
    private Blob content;
    private Double version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blob getContent() {
        return content;
    }

    public void setContent(Blob content) {
        this.content = content;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return getId().equals(document.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
