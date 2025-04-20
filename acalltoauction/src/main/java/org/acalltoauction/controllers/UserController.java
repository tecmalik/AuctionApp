package org.acalltoauction.controllers;

import jakarta.validation.Valid;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.ApiResponse;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.acalltoauction.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/Signup/users")
    public ResponseEntity<?> signUp(@Valid @RequestBody UserSignUpRequest userSignUpRequest){
        try{
            UserSignUpResponse userSignUpResponse = userService.signUp(userSignUpRequest);
            return new ResponseEntity<>(new ApiResponse(true,userSignUpResponse), HttpStatus.CREATED);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false,exception.getMessage()),HttpStatus.BAD_REQUEST);
        }

    }

}
