package com.edasocial.users_srv.users.application;

import com.edasocial.users_srv.users.domain.entities.User;
import com.edasocial.users_srv.users.domain.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;


    @InjectMocks
    UserService service;

    @Test
    public void createUser_should_create_user () {

        UserService uut = new UserService(repository);

        uut.createUser("carmine@email.com");

        var captor = ArgumentCaptor.forClass(User.class);

        verify(repository).save(captor.capture());
        assertThat(captor.getValue().events()).hasSize(1);

    }
}