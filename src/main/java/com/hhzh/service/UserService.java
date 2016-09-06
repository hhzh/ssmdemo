package com.hhzh.service;

import com.hhzh.entity.User;

public interface UserService {

    public User queryUserById(int id);

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUserById(int id);

}
