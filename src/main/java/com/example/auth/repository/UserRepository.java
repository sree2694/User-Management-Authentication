package com.example.auth.repository;

import com.example.auth.entity.UserEntity;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, UserEntity> users = new HashMap<>();

    public UserRepository() {
        users.put("admin", new UserEntity("admin", "$2a$10$bcryptHashedPassword"));
    }

    public UserEntity findByUsername(String username) {
        return users.get(username);
    }
}
