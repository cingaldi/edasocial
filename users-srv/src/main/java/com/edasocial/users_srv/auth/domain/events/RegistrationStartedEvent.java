package com.edasocial.users_srv.auth.domain.events;

import com.edasocial.users_srv.commons.events.DomainEvent;

public class RegistrationStartedEvent implements DomainEvent {

    private String email;
    private String registrationToken;

    public RegistrationStartedEvent(String email, String registrationToken) {
        this.email = email;
        this.registrationToken = registrationToken;
    }

    public String getEmail() {
        return email;
    }

    public String getRegistrationToken() {
        return this.registrationToken;
    }
}
