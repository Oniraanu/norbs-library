package com.oniraanu.norbslibrary.services;

import com.oniraanu.norbslibrary.dtos.request.AccountCreationRequest;
import com.oniraanu.norbslibrary.dtos.request.UpdateAccountRequest;
import com.oniraanu.norbslibrary.models.User;

import java.util.List;

public interface UserService {

    User createAccount(String host, AccountCreationRequest accountCreationRequest);

    User findUserById(String userId);

    List <User> findAll();

    User updateProfile(String userId, UpdateAccountRequest updateAccountRequest);

    User findUserByEmail(String emailAddress);

    void verifyUser(String token);
}
