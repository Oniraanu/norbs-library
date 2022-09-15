package com.oniraanu.norbslibrary.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreationRequest {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
}
