package org.acalltoauction.services;

import org.acalltoauction.data.repositories.UserRepository;
import org.acalltoauction.dto.requests.UserLoginRequest;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserLoginResponse;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    private UserServiceImpl userServiceImpl;


    @Test
    public void UserCanSignUpTest(){
        UserSignUpRequest userRequest = new UserSignUpRequest();
        userRequest.setEmail("test@acalltoauction.com");
        userRequest.setPassword("password");
        userRequest.setNin("12345672345");
        UserSignUpResponse response = userServiceImpl.signUp(userRequest);
//        assertEquals(1,userRepository.count());
        assertThat(response,notNullValue());

    }
    @Test
    public void UserCanLoginTest(){
        UserSignUpRequest userRequest = new UserSignUpRequest();
        userRequest.setEmail("test@acalltoauction.com");
        userRequest.setPassword("password");
        userRequest.setNin("12345672345");
        UserSignUpResponse response = userServiceImpl.signUp(userRequest);
//        assertEquals(1,userRepository.count());
        assertThat(response,notNullValue());
        UserLoginRequest userLoginRequest = new UserLoginRequest();
        userLoginRequest.setEmail("test@acalltoauction.com");
        userLoginRequest.setPassword("password");
        UserLoginResponse userLoginResponse = userServiceImpl.login(userLoginRequest);
        assertThat(userLoginResponse,notNullValue());

    }

}