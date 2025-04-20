package org.acalltoauction.services;

import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.mongo.transitions.MongodStarter;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    private MongodExecutable mongodExecutable;
    private MongodClient mongodClient;
    @BeforeEach
    void setUp() throws IOException {


    }

    @AfterEach
    void tearDown() {
        mongodExecutable.stop();
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