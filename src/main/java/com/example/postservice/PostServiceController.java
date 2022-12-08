package com.example.postservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostServiceController {

    @GetMapping("welcome")
    public String welcome(){
        return "hi";
    }

}
