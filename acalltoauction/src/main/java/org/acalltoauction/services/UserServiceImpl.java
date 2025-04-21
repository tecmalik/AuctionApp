package org.acalltoauction.services;

import org.acalltoauction.data.models.User;
import org.acalltoauction.data.repositories.UserRepository;
import org.acalltoauction.dto.requests.UserDeleteRequest;
import org.acalltoauction.dto.requests.UserLoginRequest;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserDeleteResponse;
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
        validateUserLoginRequest(userLoginRequest);
        User user = userRepository.findByEmail(userLoginRequest.getEmail());
        validateUser(user);
        UserLoginResponse userLoginResponse = new UserLoginResponse();
        userLoginResponse.setMessage("Login Successful");
        return userLoginResponse;
    }

    @Override
    public UserDeleteResponse deleteUser(UserDeleteRequest userDeleteRequest) {
        validateUserDeleteRequest(userDeleteRequest);
        return null;
    }

    private void validateUserDeleteRequest(UserDeleteRequest userDeleteRequest) {
        if (userDeleteRequest.getEmail() == null) {
            throw new NullPointerException("Email is required");
        }
        if (userDeleteRequest.password == null) {
            throw new NullPointerException("Password is required");
        }
        if (userDeleteRequest.getEmail().trim().isEmpty()){
            throw new NullPointerException("Email is required");
        }
        if (userDeleteRequest.password.trim().isEmpty()) {
            throw new NullPointerException("Password is required");
        }
    }

    private void validateUserLoginRequest(UserLoginRequest userLoginRequest) {
        if (userLoginRequest.getEmail() == null) {
            throw new NullPointerException("Email is required");
        }
        if (userLoginRequest.getPassword() == null) {
            throw new NullPointerException("Password is required");
        }
        if (userLoginRequest.getEmail().trim().isEmpty()) {
            throw new NullPointerException("Email is required");
        }
        if (userLoginRequest.getPassword().trim().isEmpty() ){
            throw new NullPointerException("Password is required");
        }
    }

    private void validateUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) == null) {
            throw new InvalidUserException("User Does Not Exist");
        }

    }

}