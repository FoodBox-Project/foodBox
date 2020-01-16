package com.github.foodbox_project.dal.user;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
