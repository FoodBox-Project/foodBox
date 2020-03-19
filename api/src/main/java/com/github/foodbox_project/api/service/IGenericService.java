package com.github.foodbox_project.api.service;

import com.github.foodbox_project.model.AEntity;

import java.io.Serializable;

public interface IGenericService<T extends AEntity, ID extends Serializable> {

    <S extends T> S save(S entity);

    T getById(ID id);

    void delete(T entity);

    void deleteById(ID id);
}
