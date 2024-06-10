package com.metrodata.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHomePage() {
        return new String("Welcome to Home Page");
    }
    
}
