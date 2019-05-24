package com.example.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @Value("${name}")
    String name;

    @GetMapping("/name")
    public String name() {
        return name;
    }
}
