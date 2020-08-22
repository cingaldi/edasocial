package com.edasocial.users_srv.auth.domain.entities;

public class HardcodedRegistrationTokenStrategy implements RegistrationTokenStrategy {
    @Override
    public RegistrationToken create() {
        return new RegistrationToken("token");
    }
}
