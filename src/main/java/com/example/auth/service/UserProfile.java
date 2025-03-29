package com.example.auth.service;
// Removed import as UserProfileProxy is now in its own file


interface UserProfile {
    String getProfileData();
}

class RealUserProfile implements UserProfile {
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

// Removed UserProfileProxy class as it is now in its own file
