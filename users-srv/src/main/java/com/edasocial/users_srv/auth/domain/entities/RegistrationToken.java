package com.edasocial.users_srv.auth.domain.entities;

public class RegistrationToken {

    private String token;

    public RegistrationToken() {
    }

    public RegistrationToken(String token) {
        this.token = token;
    }

    public String token() {
        return token;
    }
}
