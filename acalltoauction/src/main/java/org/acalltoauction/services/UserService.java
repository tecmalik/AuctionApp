package org.acalltoauction.services;

import org.acalltoauction.data.models.LotStatus;
import org.acalltoauction.dto.requests.LotCreationRequest;
import org.acalltoauction.dto.requests.UserDeleteRequest;
import org.acalltoauction.dto.requests.UserLoginRequest;
import org.acalltoauction.dto.requests.UserSignUpRequest;
import org.acalltoauction.dto.response.LotCreationResponse;
import org.acalltoauction.dto.response.UserDeleteResponse;
import org.acalltoauction.dto.response.UserSignUpResponse;
import org.acalltoauction.dto.response.UserLoginResponse;
public interface UserService {
    UserSignUpResponse signUp(UserSignUpRequest userSignUpRequest);
    UserLoginResponse login(UserLoginRequest userLoginRequest);
    UserDeleteResponse deleteUser(UserDeleteRequest userDeleteRequest);
    LotCreationResponse createLot(LotCreationRequest userLotRequest);
}

