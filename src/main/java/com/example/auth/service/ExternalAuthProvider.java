package com.example.auth.service;

public interface ExternalAuthProvider {
    boolean authenticate(String username, String password);
}

class GoogleAuth implements ExternalAuthProvider {
    @Override
    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating with Google OAuth...");
        return true;
    }
}

class LDAPAuth implements ExternalAuthProvider {
    @Override
    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating with LDAP...");
        return true;
    }
}

// ExternalAuthAdapter moved to its own file
