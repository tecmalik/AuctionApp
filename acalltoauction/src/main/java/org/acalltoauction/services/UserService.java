package org.acalltoauction.services;

import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserSignupResponse;

public interface UserService {
    UserSignupResponse signUp(UserSignUpRequest userSignUpRequest);
}
