package com.github.foodbox_project.service.user;

import com.github.foodbox_project.dal.user.UserCredentialsRepository;
import com.github.foodbox_project.model.user.UserCredentials;
import com.github.foodbox_project.model.user.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailsImpl implements UserDetailsService {

    private final UserCredentialsRepository userCredentialsRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserCredentials user = userCredentialsRepository.getByEmail_Email(email);

        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        Collection<? extends GrantedAuthority> grantedAuthorities = mapRolesToGrantedAuthorities(List.of(user.getUser().getUserRole()));
        return new User(user.getEmail().getEmail(), user.getPassword(), grantedAuthorities);
    }

    private Collection<? extends GrantedAuthority> mapRolesToGrantedAuthorities(Collection<UserRole> roles){
       return roles.stream().map(r -> new SimpleGrantedAuthority(r.name())).collect(Collectors.toList());
    }
}
