package com.security.spring_sceurity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.spring_sceurity.model.User;
import com.security.spring_sceurity.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getALlUsers() {
        return userService.getALlUsers();
    }

    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

}
