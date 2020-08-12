package com.edasocial.users_srv.auth.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/registrations")
public class RegistrationController {

    @PostMapping
    public ResponseEntity createRegistration () {
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
