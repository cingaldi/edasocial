package com.edasocial.users_srv.domain.entities;


import com.edasocial.users_srv.domain.events.UserCreatedEvent;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.domain.DomainEvents;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

public class User extends AbstractAggregateRoot {


    public User() {
        registerEvent(new UserCreatedEvent());
    }

    public static User create() {
        return new User();
    }

    @DomainEvents
    public Collection events() {
        return super.domainEvents();
    }
}
