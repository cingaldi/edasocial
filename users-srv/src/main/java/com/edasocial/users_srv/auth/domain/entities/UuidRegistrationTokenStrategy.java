package com.edasocial.users_srv.auth.domain.entities;

import java.util.UUID;

public class UuidRegistrationTokenStrategy implements RegistrationTokenStrategy {

    @Override
    public RegistrationToken create() {
        return new RegistrationToken(UUID.randomUUID().toString());
    }
}
