package com.edasocial.users_srv.auth.domain.services.entities;

import com.edasocial.users_srv.auth.domain.entities.Registration;
import com.edasocial.users_srv.auth.domain.entities.UuidRegistrationTokenStrategy;
import com.edasocial.users_srv.auth.domain.events.RegistrationStartedEvent;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class RegistrationTest {

    @Test
    public void given_email_when_register_event_triggered()  {

        Registration uut = Registration.create("carmine@gmail.com");

        var evt = ((RegistrationStartedEvent)uut.events().iterator().next());
        assertThat(evt.getEmail()).isEqualTo("carmine@gmail.com");
        assertThat(evt.getRegistrationToken()).isNotEmpty();
    }

    @Test
    public void given_token_generator_when_register_shuould_get_token () {

        Registration uut = Registration.create("carmine@gmail.com" , new UuidRegistrationTokenStrategy());

        var evt = ((RegistrationStartedEvent)uut.events().iterator().next());

        assertThat(evt.getRegistrationToken()).isEqualTo(uut.registrationToken().token());
    }

}