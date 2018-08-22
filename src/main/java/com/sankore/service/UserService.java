package com.sankore.service;

import com.sankore.model.User;
import com.sankore.service.contract.UserServiceContract;

import java.util.List;

public class UserService implements UserServiceContract {


    public List<User> getUsers() {
        //TODO:
        return null;
    }

    public User getUser(String username) {
        //TODO:
        return null;
    }

    public User resetPassword(User user) {
        //TODO:
        return null;
    }

    public User createUser(User user) {
        //TODO:
        return null;
    }

    public User disableUser(User user) {
        //TODO: change the status of the user to disable
        return null;
    }

    public User updateUser(User user) {
        //TODO:
        return null;
    }
}
