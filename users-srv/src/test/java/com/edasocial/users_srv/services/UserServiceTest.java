package com.edasocial.users_srv.services;

import com.edasocial.users_srv.domain.entities.User;
import com.edasocial.users_srv.domain.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @Test
    public void createUser_should_create_user () {

        UserService uut = new UserService(repository);

        uut.createUser();

        verify(repository, times(1)).save(any(User.class));


    }

}