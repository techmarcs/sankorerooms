package com.sankore.service.contract;

import com.sankore.model.User;

import java.util.List;

public interface UserServiceContract {
    List<User> getUsers();
    User getUser(String username);
    User resetPassword(User user);
    User createUser(User user);
    User disableUser(User user);
    User updateUser(User user);

}
