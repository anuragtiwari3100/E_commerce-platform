package com.tiwari.service;

import com.tiwari.exception.SellerException;
import com.tiwari.exception.UserException;
import com.tiwari.request.LoginRequest;
import com.tiwari.request.SignupRequest;
import com.tiwari.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
