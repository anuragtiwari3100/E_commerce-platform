package com.tiwari.controller;

import com.tiwari.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping
   public ApiResponse HomeControllerHandler(){
        ApiResponse apiResponse = new  ApiResponse();
        apiResponse.setMessage("welcome to E_commerce");
         return  apiResponse;
   }
}
