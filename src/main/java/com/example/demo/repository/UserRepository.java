package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public User sayUser(User user) {
        user.setId((long) users.size() + 1);
        users.add(user);
        return user;
        
    }

    public List<User> findById(Long id) {
        return users;
    }
    
}
