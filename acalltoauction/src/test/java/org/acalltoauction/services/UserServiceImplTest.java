package org.acalltoauction.services;

import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import de.flapdoodle.embed.


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;
    private MongodExecutable mongodExecutable;


    @BeforeEach
    void setUp() throws IOException {


    }

    @AfterEach
    void tearDown() {
        mongoTemplate.
    }

    @Test
    public void UserCanSignUpTest(){
        UserSignUpRequest userRequest = new UserSignUpRequest();
        userRequest.setEmail("test@acalltoauction.com");
        userRequest.setPassword("password");
        userRequest.setNin("nin");
        userService.signUp(userRequest);



    }

}