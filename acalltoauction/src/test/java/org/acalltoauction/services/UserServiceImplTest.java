package org.acalltoauction.services;

import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired

    @Test
    public void UserCanSignUpTest(){
        UserSignUpRequest userRequest = new UserSignUpRequest();
        userRequest.setEmail("test@acalltoauction.com");
        userRequest.setPassword("password");
        userRequest.setNin("12345672345");
        UserSignUpResponse response = userService.signUp(userRequest);
        assertEquals(1,userRepository.count());
        assertThat(response,notNullValue());

    }
    @Test
    public void UserCanLoginTest(){

    }

}