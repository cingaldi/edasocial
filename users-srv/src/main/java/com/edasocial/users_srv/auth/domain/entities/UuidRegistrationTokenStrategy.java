package com.edasocial.users_srv.auth.domain.entities;

import java.util.UUID;

public class UuidRegistrationTokenStrategy {
    public RegistrationToken create() {
        return new RegistrationToken(UUID.randomUUID().toString());
    }
}
