package com.edasocial.users_srv.auth.domain.entities;

import com.edasocial.users_srv.auth.domain.events.RegistrationStartedEvent;
import com.edasocial.users_srv.commons.events.DomainEvent;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.domain.DomainEvents;

import java.util.Collection;

public class Registration extends AbstractAggregateRoot {
    public static Registration create(String email) {
        Registration ret = new Registration();
        ret.registerEvent(new RegistrationStartedEvent(email));
        return ret;
    }

    @DomainEvents
    public Collection<DomainEvent> events() {
        return this.domainEvents();
    }
}
