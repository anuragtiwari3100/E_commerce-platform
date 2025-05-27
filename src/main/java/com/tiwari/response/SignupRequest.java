package com.tiwari.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignupRequest {
    private  String email;
    private  String fullName;
    private  String otp;
//    private  String password;
}
