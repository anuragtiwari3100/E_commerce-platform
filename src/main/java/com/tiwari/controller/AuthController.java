package com.tiwari.controller;

import com.tiwari.domain.USER_ROLE;
import com.tiwari.model.User;
import com.tiwari.model.VerificationCode;
import com.tiwari.repository.UserRepository;
import com.tiwari.response.ApiResponse;
import com.tiwari.response.AuthResponse;
import com.tiwari.response.SignupRequest;
import com.tiwari.service.AuthService;
import jakarta.mail.MessagingException;
import jdk.jshell.spi.ExecutionControl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

     private  final UserRepository userRepository;
     private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse>createUserHandler(@RequestBody SignupRequest req) throws Exception {
      String jwt = authService.createUser(req);
        AuthResponse res = new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("Register success");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);
        return new ResponseEntity<>(res, HttpStatus.OK);

    }

    @PostMapping("/sent/login-signup-otp")
    public ResponseEntity<ApiResponse> sentLoginOtp(@RequestBody VerificationCode req) throws Exception {
        authService.sentLoginOtp((req.getEmail()));

        ApiResponse res = new ApiResponse();
        res.setMessage("otp sent successfully...");
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }



}
