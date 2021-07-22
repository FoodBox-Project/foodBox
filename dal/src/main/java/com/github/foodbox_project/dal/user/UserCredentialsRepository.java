package com.github.foodbox_project.dal.user;

import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.model.user.UserCredentials;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialsRepository extends GenericRepository<UserCredentials, Long> {

    UserCredentials getByEmail_Email(String email);

}
