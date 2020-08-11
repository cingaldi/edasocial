package com.edasocial.users_srv.services;

import com.edasocial.users_srv.entities.User;
import com.edasocial.users_srv.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public void createUser() {

        userRepository.save(User.create());

    }
}
