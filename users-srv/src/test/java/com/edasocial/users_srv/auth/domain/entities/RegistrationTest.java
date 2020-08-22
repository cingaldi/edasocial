package com.edasocial.users_srv.auth.domain.entities;

import com.edasocial.users_srv.auth.domain.entities.Registration;
import com.edasocial.users_srv.auth.domain.entities.RegistrationStatusEnum;
import com.edasocial.users_srv.auth.domain.entities.UuidRegistrationTokenStrategy;
import com.edasocial.users_srv.auth.domain.events.RegistrationStartedEvent;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RegistrationTest {

    @Test
    public void given_email_when_register_event_triggered()  {

        Registration uut = Registration.create("carmine@gmail.com");

        var evt = ((RegistrationStartedEvent)uut.events().iterator().next());
        assertThat(evt.getEmail()).isEqualTo("carmine@gmail.com");
    }

    @Test
    public void when_register_then_status_pending() {

        Registration uut = Registration.create("carmine@gmail.com");

        assertThat(uut.withStatus(RegistrationStatusEnum.PENDING)).isTrue();
    }

    @Test
    public void given_token_generator_when_register_shuould_get_token () {

        Registration uut = Registration.create("carmine@gmail.com" , new UuidRegistrationTokenStrategy());

        var evt = ((RegistrationStartedEvent)uut.events().iterator().next());

        assertThat(evt.getRegistrationToken()).isEqualTo(uut.registrationToken().token());
    }

}