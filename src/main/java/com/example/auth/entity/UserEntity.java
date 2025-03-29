package com.example.auth.entity;

public class UserEntity {
    private String username;
    private String password;

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }
// New method added to fix the issue
public String getProfileData() {
    return "Profile data for user: " + username;
}
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
