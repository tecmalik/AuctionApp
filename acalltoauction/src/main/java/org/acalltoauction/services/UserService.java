package org.acalltoauction.services;

import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.UserSignUpResponse;

public interface UserService {
    UserSignUpResponse signUp(UserSignUpRequest userSignUpRequest);
}
