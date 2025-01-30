package com.example.basic_rest_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestControllerApi {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

}
