package com.edasocial.users_srv.users.domain.entities;


import com.edasocial.users_srv.users.domain.events.UserCreatedEvent;
import org.springframework.cglib.core.GeneratorStrategy;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.domain.DomainEvents;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "users")
public class User extends AbstractAggregateRoot {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "email" , unique = true , length = 64)
    private String email;

    public User() {
        registerEvent(new UserCreatedEvent());
    }

    public User(String email) {
        this();
        this.email = email;
    }

    public static User create(String email) {
        return new User(email);
    }

    @DomainEvents
    public Collection events() {
        return super.domainEvents();
    }
}
