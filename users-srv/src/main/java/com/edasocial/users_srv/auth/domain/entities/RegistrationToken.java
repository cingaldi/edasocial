package com.edasocial.users_srv.auth.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;


@Entity(name = "registration_tokens")
public class RegistrationToken {

    @Id
    @Column(name="token" , unique = true , nullable = false)
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
