package com.edasocial.users_srv.auth.domain.services.entities;

import com.edasocial.users_srv.auth.domain.entities.Registration;
import com.edasocial.users_srv.auth.domain.events.RegistrationStartedEvent;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class RegistrationTest {

    @Test
    public void given_email_when_register_event_triggered()  {

        Registration uut = Registration.create("carmine@gmail.com");

        assertThat(uut.events()).hasSize(1);
        assertThat(((RegistrationStartedEvent)uut.events().iterator().next()).getEmail()).isEqualTo("carmine@gmail.com");
    }

}