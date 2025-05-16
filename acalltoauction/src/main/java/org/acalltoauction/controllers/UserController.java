package org.acalltoauction.controllers;

import jakarta.validation.Valid;
import org.acalltoauction.dto.requests.UserDeleteRequest;
import org.acalltoauction.dto.requests.UserLoginRequest;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.ApiResponse;
import org.acalltoauction.dto.response.UserDeleteResponse;
import org.acalltoauction.dto.response.UserLoginResponse;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.acalltoauction.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/signup/users")
    public ResponseEntity<?> signUp(@Valid @RequestBody UserSignUpRequest userSignUpRequest){
        try{
            UserSignUpResponse userSignUpResponse = userService.signUp(userSignUpRequest);
            return new ResponseEntity<>(new ApiResponse(true , userSignUpResponse, "201"), HttpStatus.CREATED);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false , exception.getMessage()," "),HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping("/login/users")
    public ResponseEntity<?> login(@Valid @RequestBody UserLoginRequest userLoginRequest){
        try{
            UserLoginResponse userLoginResponse = userService.login(userLoginRequest);
            return new ResponseEntity<>(new ApiResponse(true , userLoginResponse," "), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false , exception.getMessage()," "),HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/delete/{userEmail}")
    public ResponseEntity<?> deleteUser(@RequestBody UserDeleteRequest userDeleteRequest){
        try {
            UserDeleteResponse userDeleteResponse = userService.deleteUser(userDeleteRequest);
            return new ResponseEntity<>(new ApiResponse(true, userDeleteResponse," "), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false , exception.getMessage()," "),HttpStatus.BAD_REQUEST);
        }
    }




}
