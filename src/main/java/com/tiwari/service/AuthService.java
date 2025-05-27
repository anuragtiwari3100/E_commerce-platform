package com.tiwari.service;

import com.tiwari.response.SignupRequest;

public interface AuthService {
   String createUser(SignupRequest req) throws Exception;
   void  sentLoginOtp(String email) throws Exception;
}
