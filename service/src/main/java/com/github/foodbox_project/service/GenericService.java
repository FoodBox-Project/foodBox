package com.github.foodbox_project.service;

import com.github.foodbox_project.api.service.IGenericService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.AEntity;

import java.io.Serializable;

public abstract class GenericService<T extends AEntity, ID extends Serializable> implements IGenericService<T, ID> {

    protected abstract GenericRepository<T, ID> getDao();

    @Override
    public <S extends T> S save(S entity) {
        return getDao().save(entity);
    }

    @Override
    public T getById(ID id) {
        return getDao().getOne(id);
    }

    @Override
    public void delete(T entity) {
        getDao().delete(entity);
    }

    @Override
    public void deleteById(ID id) {
        getDao().deleteById(id);
    }

    protected long countPages(int pageSize) {
        double itemsCount = (double) getDao().count();
        return (long) Math.ceil(itemsCount/pageSize);
    }
}
