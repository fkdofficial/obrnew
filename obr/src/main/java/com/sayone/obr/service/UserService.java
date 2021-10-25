package com.sayone.obr.service;

import com.sayone.obr.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDto createUser(UserDto user);

    UserDto getUser(String email);
}