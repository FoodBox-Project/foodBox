package com.github.foodbox_project.dal;

import com.github.foodbox_project.model.AEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface GenericRepository<T extends AEntity, ID extends Serializable> extends JpaRepository<T, ID> {
}
