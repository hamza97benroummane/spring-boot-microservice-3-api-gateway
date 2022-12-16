package com.benroummane.springbootmicroservice3apigateway.service;

import com.benroummane.springbootmicroservice3apigateway.model.User;


public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
