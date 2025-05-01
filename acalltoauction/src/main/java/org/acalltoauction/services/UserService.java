package org.acalltoauction.services;

import org.acalltoauction.dto.requests.*;
import org.acalltoauction.dto.response.*;

public interface UserService {
    UserSignUpResponse signUp(UserSignUpRequest userSignUpRequest);
    UserLoginResponse login(UserLoginRequest userLoginRequest);
    UserDeleteResponse deleteUser(UserDeleteRequest userDeleteRequest);
    LotCreationResponse createLot(LotCreationRequest userLotRequest);
    DeleteLotResponse deleteLot(DeleteLotRequest deleteLotRequest);
    LotStatusResponse checkStatus(LotStatusRequest lotStatusRequest);
    AuctionResponse createAuction(AuctionRequest auctionRequest);
    DeleteAuctionResponse deleteAuction(DeleteAuctionRequest deleteAuctionRequest);
}

