package com.tiwari.controller;

import com.tiwari.model.User;
import com.tiwari.repository.UserRepository;
import com.tiwari.response.SignupRequest;
import lombok.RequiredArgsConstructor;
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
    @PostMapping("/signup")
    public ResponseEntity<User>   createUserHandler(@RequestBody SignupRequest req){
         User user = new User();
         user.setEmail(req.getEmail());
         user.setFullName(req.getFullName());
         user.setPassword(req.getPassword()); //creted by me was not required
   User savedUser = userRepository.save(user);
         return  ResponseEntity.ok(savedUser);

    }


}
