package com.tiwari.service.impl;

import com.tiwari.domain.USER_ROLE;
import com.tiwari.model.Cart;
import com.tiwari.model.User;
import com.tiwari.repository.CartRepository;
import com.tiwari.repository.UserRepository;
import com.tiwari.response.SignupRequest;
import com.tiwari.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private  final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private  final CartRepository cartRepository;

    @Override
    public String createUser(SignupRequest req) {
        User user = userRepository.findByEmail(req.getEmail());
        if(user == null){
           User createdUser =new User();
            createdUser.setEmail(req.getEmail());
            createdUser.setFullName(req.getFullName());
            createdUser.setRole(USER_ROLE.ROLE_SELLER);
             createdUser.setMobile("6204837397");
             createdUser.setPassword(passwordEncoder.encode(req.getOtp()));
           user = userRepository.save(createdUser);
            Cart cart = new Cart();
             cart.setUser(user);
             cartRepository.save(cart);
        }
        return "";
    }
}
