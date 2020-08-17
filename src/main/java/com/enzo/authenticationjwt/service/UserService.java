package com.enzo.authenticationjwt.service;

import com.enzo.authenticationjwt.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
