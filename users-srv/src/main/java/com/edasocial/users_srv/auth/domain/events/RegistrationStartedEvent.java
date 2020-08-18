package com.edasocial.users_srv.auth.domain.events;

import com.edasocial.users_srv.commons.events.DomainEvent;

public class RegistrationStartedEvent implements DomainEvent {

    private String email;

    public RegistrationStartedEvent(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
