package com.oniraanu.norbslibrary.services;

import com.oniraanu.norbslibrary.dtos.request.AccountCreationRequest;
import com.oniraanu.norbslibrary.dtos.request.UpdateAccountRequest;
import com.oniraanu.norbslibrary.models.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public User createAccount(String host, AccountCreationRequest accountCreationRequest) {
        return null;
    }

    @Override
    public User findUserById(String userId) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User updateProfile(String userId, UpdateAccountRequest updateAccountRequest) {
        return null;
    }

    @Override
    public User findUserByEmail(String emailAddress) {
        return null;
    }

    @Override
    public void verifyUser(String token) {

    }
}
