package org.acalltoauction.services;

import org.acalltoauction.data.models.User;
import org.acalltoauction.data.repositories.UserRepository;
import org.acalltoauction.dto.requests.UserLoginRequest;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserLoginResponse;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.acalltoauction.exceptions.InvalidUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

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

    @Override
    public UserLoginResponse login(UserLoginRequest userLoginRequest) {
        validateUser(userLoginRequest);
        User user = userRepository.findByEmail(userLoginRequest.getEmail());
        return null;
    }

    private void validateUser(UserLoginRequest userLoginRequest) {
        if (userLoginRequest.getPassword() == null) {
            throw new InvalidUserException("User Does Not Exist");
        }
    }

}