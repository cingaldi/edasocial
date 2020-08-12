package com.edasocial.users_srv.users.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    @PostMapping
    public ResponseEntity<Void> createUser() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
