package org.acalltoauction.services;

import org.acalltoauction.dto.requests.UserLoginRequest;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.acalltoauction.dto.response.UserLoginResponse;
public interface UserService {
    UserSignUpResponse signUp(UserSignUpRequest userSignUpRequest);
    UserLoginResponse login(UserLoginRequest userLoginRequest);
}
