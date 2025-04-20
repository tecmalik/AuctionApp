//package org.acalltoauction.services;
//
//import org.acalltoauction.data.repository.UserRepository;
//import org.acalltoauction.dto.requests.UserSignUpRequest;
//import org.acalltoauction.dto.response.UserSignUpResponse;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import de.flapdoodle.embed.mongo.config.Net;
//
//
//import java.io.IOException;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.notNullValue;
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataMongoTest
//@SpringBootTest
//class UserServiceImplTest {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    private MongoTemplate mongoTemplate;
////    private MongodExecutable mongodExecutable;
//
//
//    @BeforeEach
//    void setUp() throws IOException {
//
//
//    }
//
//    @AfterEach
//    void tearDown() {
//        mongoTemplate.
//    }
//
//    @Test
//    public void UserCanSignUpTest(){
//        UserSignUpRequest userRequest = new UserSignUpRequest();
//        userRequest.setEmail("test@acalltoauction.com");
//        userRequest.setPassword("password");
//        userRequest.setNin("12345672345");
//        UserSignUpResponse response = userService.signUp(userRequest);
//        assertEquals(1,userRepository.count());
//        assertThat(response,notNullValue());
//
//    }
//    @Test
//    public void UserCanLoginTest(){
//
//    }
//
//}