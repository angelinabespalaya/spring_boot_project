package com.angelina.demo_cargo.service;


import com.angelina.demo_cargo.dto.UserDto;
import com.angelina.demo_cargo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
