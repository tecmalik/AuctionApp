package org.acalltoauction.services;

import org.acalltoauction.data.models.Lot;
import org.acalltoauction.data.models.User;
import org.acalltoauction.data.repositories.LotRepository;
import org.acalltoauction.data.repositories.UserRepository;
import org.acalltoauction.dto.requests.*;
import org.acalltoauction.dto.response.*;
import org.acalltoauction.exceptions.InvalidCredentials;
import org.acalltoauction.exceptions.InvalidUserException;
import org.acalltoauction.exceptions.LotAlreadyExist;
import org.acalltoauction.exceptions.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    LotRepository lotRepository;

    @Override
    public UserSignUpResponse signUp(UserSignUpRequest userSignUpRequest) {
        validateUserSignupRequest(userSignUpRequest);
        validateUserExistence(userSignUpRequest);
        User user = new User();
        user.setEmail(userSignUpRequest.getEmail());
        user.setPassword(userSignUpRequest.getPassword());
        user.setNin(userSignUpRequest.getNin());
        userRepository.save(user);
        UserSignUpResponse userSignupResponse = new UserSignUpResponse();
        userSignupResponse.setMessage("SignUp Successful");
        return userSignupResponse;
    }

    private void validateUserSignupRequest(UserSignUpRequest userSignUpRequest) {
        if (userSignUpRequest.getEmail() == null || userSignUpRequest.getEmail().trim().isEmpty()) throw new NullPointerException("Email is required");
        if (userSignUpRequest.getPassword() == null || userSignUpRequest.getPassword().trim().isEmpty()) throw new NullPointerException("Password is required");
        if (userSignUpRequest.getNin() == null || userSignUpRequest.getNin().trim().isEmpty()) throw new NullPointerException("Nin is required");
    }

    private void validateUserExistence(UserSignUpRequest userSignUpRequest) {
        if (userRepository.findByEmail(userSignUpRequest.getEmail()) != null)throw new UserAlreadyExistException("Email already exists");
    }

    @Override
    public UserLoginResponse login(UserLoginRequest userLoginRequest) {
        validateUserLoginRequest(userLoginRequest);
        User user = userRepository.findByEmail(userLoginRequest.getEmail());
        validateUser(user);
        validateUserPassword(userLoginRequest , user);
        UserLoginResponse userLoginResponse = new UserLoginResponse();
        userLoginResponse.setMessage("Login Successful");
        return userLoginResponse;
    }

    private void validateUserPassword(UserLoginRequest userLoginRequest, User user) {
        if (!user.getPassword().equals(userLoginRequest.getPassword())) throw new InvalidCredentials("invalid Credentials");
    }

    @Override
    public UserDeleteResponse deleteUser(UserDeleteRequest userDeleteRequest) {
        validateUserDeleteRequest(userDeleteRequest);
        User user = userRepository.findByEmail(userDeleteRequest.getEmail());
        validateUser(user);
        userRepository.delete(user);
        UserDeleteResponse userDeleteResponse = new UserDeleteResponse();
        userDeleteResponse.setMessage("Delete Successful");
        return userDeleteResponse;
    }

    @Override
    public LotCreationResponse createLot(LotCreationRequest lotCreationRequest ) {
        validateLotRequest(lotCreationRequest);
        ValidateLotExistence(lotCreationRequest);
        Lot lot = new Lot();
        lot.setLotName(lotCreationRequest.getLotName());
        lot.setDescription(lotCreationRequest.getDescription());
        lot.setDescription(lotCreationRequest.getDescription());
        lotRepository.save(lot);
        LotCreationResponse lotCreationResponse = new LotCreationResponse();
        lotCreationResponse.setMessage("Create Successful, Lto be Dispatched by musa 090234567 ");
        return lotCreationResponse;
    }

    private void ValidateLotExistence(LotCreationRequest lotCreationRequest){
        if (lotRepository.findByLotName(lotCreationRequest.getLotName()) != null)throw new LotAlreadyExist("lot already exist");
        if (lotRepository.findByImageUrl(lotCreationRequest.getImageUrl()) != null)throw new LotAlreadyExist("image already exist");

    }

    @Override
    public DeleteLotResponse deleteLot(DeleteLotRequest deleteLotRequest) {
        validateDeleteRequest(deleteLotRequest);
        Lot lot = lotRepository.findByLotName(deleteLotRequest.getLotName());
        lotRepository.delete(lot);
        DeleteLotResponse deleteLotResponse = new DeleteLotResponse();
        deleteLotResponse.setMessage("Delete Successful");
        return deleteLotResponse;
    }

    private void validateDeleteRequest(DeleteLotRequest deleteLotRequest) {
        if (deleteLotRequest.getLotName() == null) throw new NullPointerException("Email is required");
        if (deleteLotRequest.getLotName().trim().isEmpty())throw new NullPointerException("Email is required");

    }

    private void validateLotRequest(LotCreationRequest lotCreationRequest) {
        if (lotCreationRequest.getLotName() == null) throw new NullPointerException("Email is required");
        if (lotCreationRequest.getImageUrl() == null) throw new NullPointerException("Password is required");
        if (lotCreationRequest.getDescription() == null) throw new NullPointerException("Description is required");
        if (lotCreationRequest.getLotName().trim().isEmpty())throw new NullPointerException("Email is required");
        if (lotCreationRequest.getImageUrl().trim().isEmpty())throw new NullPointerException("Password is required");
        if (lotCreationRequest.getDescription().trim().isEmpty())throw new NullPointerException("Description is required");
    }

    private void validateUserDeleteRequest(UserDeleteRequest userDeleteRequest) {
        if (userDeleteRequest.getEmail() == null) throw new NullPointerException("Email is required");
        if (userDeleteRequest.password == null) throw new NullPointerException("Password is required");
        if (userDeleteRequest.getEmail().trim().isEmpty())throw new NullPointerException("Email is required");
        if (userDeleteRequest.password.trim().isEmpty())throw new NullPointerException("Password is required");
    }

    private void validateUserLoginRequest(UserLoginRequest userLoginRequest) {
        if (userLoginRequest.getEmail() == null) throw new NullPointerException("Email is required");
        if (userLoginRequest.getPassword() == null)throw new NullPointerException("Password is required");
        if (userLoginRequest.getEmail().trim().isEmpty())throw new NullPointerException("Email is required");
        if (userLoginRequest.getPassword().trim().isEmpty() )throw new NullPointerException("Password is required");

    }

    private void validateUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) == null)throw new InvalidUserException("User Does Not Exist");
    }

}