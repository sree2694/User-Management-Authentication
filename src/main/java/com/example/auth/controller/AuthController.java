package com.example.auth.controller;

import com.example.auth.entity.UserEntity;
// Ensure the correct import for UserProfileProxy
import com.example.auth.service.UserProfileProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/profile")
        UserProfileProxy userProfileProxy = new UserProfileProxy("admin");
        com.example.auth.service.UserProfileProxy userProfileProxy = new com.example.auth.service.UserProfileProxy("admin");
        UserEntity userProfile = userProfileProxy.getUserEntity();
        return userProfile.getProfileData();
    }
}
