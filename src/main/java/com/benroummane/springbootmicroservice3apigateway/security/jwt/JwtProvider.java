package com.benroummane.springbootmicroservice3apigateway.security.jwt;

import com.benroummane.springbootmicroservice3apigateway.security.UserPrincipal;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;


public interface JwtProvider
{
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
