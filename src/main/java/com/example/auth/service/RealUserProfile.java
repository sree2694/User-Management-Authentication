package com.example.auth.service;

public class RealUserProfile implements UserProfile {
    private final String username;

    public RealUserProfile(String username) {
        this.username = username;
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        System.out.println("Loading user profile from database...");
    }

    @Override
    public String getProfileData() {
        return "Profile data for " + username;
    }
}

// UserProfileProxy class moved to its own file
