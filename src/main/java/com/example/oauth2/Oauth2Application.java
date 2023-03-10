package com.example.oauth2;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Oauth2Application {


    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class, args);
    }
    @GetMapping("/")
    public String message(){
        return "Hello!";
    }
}
