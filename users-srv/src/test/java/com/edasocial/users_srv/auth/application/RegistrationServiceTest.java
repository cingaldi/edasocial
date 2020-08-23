package com.edasocial.users_srv.auth.application;

import com.edasocial.users_srv.auth.domain.entities.Registration;
import com.edasocial.users_srv.auth.domain.entities.RegistrationStatusEnum;
import com.edasocial.users_srv.auth.domain.repositories.RegistrationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;


@RunWith(SpringJUnit4ClassRunner.class)
public class RegistrationServiceTest {

    @Mock
    private RegistrationRepository repository;

    @Test
    public void given_email_when_registerUser_should_create_pending_registration() {

        RegistrationService uut = new RegistrationService(repository);

        uut.registerUser("carmine@email.com");

        ArgumentCaptor<Registration> captor = ArgumentCaptor.forClass(Registration.class);
        verify(repository).save(captor.capture());

        assertThat(captor.getValue().withStatus(RegistrationStatusEnum.PENDING)).isTrue();
    }
}