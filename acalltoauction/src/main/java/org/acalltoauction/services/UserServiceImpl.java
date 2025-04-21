package org.acalltoauction.services;

import org.acalltoauction.data.models.User;
import org.acalltoauction.data.repository.UserRepository;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserSignUpResponse signUp(UserSignUpRequest userSignUpRequest) {
        User user = new User();
        user.setEmail(userSignUpRequest.getEmail());
        user.setPassword(userSignUpRequest.getPassword());
        user.setNin(userSignUpRequest.getNin());
        userRepository.save(user);
        UserSignUpResponse userSignupResponse = new UserSignUpResponse();
        userSignupResponse.setMessage("SignUp Successful");
        return userSignupResponse;
    }

}