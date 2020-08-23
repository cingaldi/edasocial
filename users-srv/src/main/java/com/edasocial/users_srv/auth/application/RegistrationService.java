package com.edasocial.users_srv.auth.application;

import com.edasocial.users_srv.auth.domain.entities.HardcodedRegistrationTokenStrategy;
import com.edasocial.users_srv.auth.domain.entities.Registration;
import com.edasocial.users_srv.auth.domain.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    RegistrationRepository repository;

    @Autowired
    public RegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    public void registerUser(String email) {
        repository.save(Registration.create(email , new HardcodedRegistrationTokenStrategy()));
    }
}
