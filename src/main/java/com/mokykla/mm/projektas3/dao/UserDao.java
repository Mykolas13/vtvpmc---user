package com.mokykla.mm.projektas3.dao;

import com.mokykla.mm.projektas3.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void createUser(User user);

    void deleteUser(String username);

}
