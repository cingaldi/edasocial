package com.edasocial.users_srv.auth.domain.entities;

import com.edasocial.users_srv.auth.domain.events.RegistrationStartedEvent;
import com.edasocial.users_srv.commons.events.DomainEvent;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.data.domain.DomainEvents;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Collection;

@Entity(name = "registrations")
public class Registration extends AbstractAggregateRoot {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "token")
    private RegistrationToken token;

    private RegistrationStatusEnum status = RegistrationStatusEnum.PENDING;

    public static Registration create(String email, RegistrationTokenStrategy strategy) {
        Registration ret = new Registration();
        ret.token = strategy.create();

        ret.registerEvent(new RegistrationStartedEvent(email , ret.token.token()));

        return ret;
    }

    @DomainEvents
    public Collection<DomainEvent> events() {
        return this.domainEvents();
    }

    public RegistrationToken registrationToken() {
        return this.token;
    }

    public boolean withStatus(RegistrationStatusEnum pending) {
        return this.status.equals(pending);
    }
}
