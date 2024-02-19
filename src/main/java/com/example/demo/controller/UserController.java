package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController //gabungan dari 2 anotasi, antara Controller dan ResponseBody
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }
    
    @PostMapping
    public User creatUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/id")
    public List<User> getUserById(@PathVariable Long id) {
        return service.getById(id);
    }
}
