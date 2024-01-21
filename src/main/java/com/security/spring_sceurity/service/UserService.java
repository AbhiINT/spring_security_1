package com.security.spring_sceurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.spring_sceurity.model.User;

@Service
public class UserService {

    List<User> user = new ArrayList<>();

    public String addUser(User user) {
        if (user != null) {
            this.user.add(user);
            return "User Saved SuccessFully";
        }

        else
            return "Error Arises";
    }

    public List<User> getALlUsers() {
        return this.user;
    }

    public User getUserById(int id) {
        User us = user.stream()
                .filter(u -> u.getId() == (id))
                .findFirst()
                .orElse(null);

        if (us != null)
            return us;
        else
            return null;
    }

}
