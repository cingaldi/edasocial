package com.edasocial.users_srv.users.services;

import com.edasocial.users_srv.users.domain.entities.User;
import com.edasocial.users_srv.users.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public void createUser(String email) {

        User created = userRepository.save(User.create(email));

    }
}
