package org.acalltoauction.controllers;

import jakarta.validation.Valid;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @PostMapping("/Signup/users")
    public ResponseEntity<?> signUp(@Valid @RequestBody UserSignUpRequest patientSignUpRequest){
        try {
            return userServiceImpl.signUp(patientSignUpRequest);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }

}
