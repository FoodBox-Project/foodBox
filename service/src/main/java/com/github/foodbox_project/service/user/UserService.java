package com.github.foodbox_project.service.user;

import com.github.foodbox_project.api.service.user.IUserService;
import com.github.foodbox_project.dal.GenericRepository;
import com.github.foodbox_project.dal.user.UserRepository;
import com.github.foodbox_project.model.user.User;
import com.github.foodbox_project.service.GenericService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService extends GenericService<User, Long> implements IUserService {

    private final UserRepository userRepository;

    @Override
    protected GenericRepository<User, Long> getDao() {
        return userRepository;
    }
}
