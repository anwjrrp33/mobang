package com.mobang.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realestate")
public class RealEstateController {

    @GetMapping("/main")
    public String main() {
        return "Hello Mobang!";
    }
}
