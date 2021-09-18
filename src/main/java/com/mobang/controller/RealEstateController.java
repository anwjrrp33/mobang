package com.mobang.controller;

import com.mobang.service.RealEstateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realestate")
@RequiredArgsConstructor //자동 주입을 위 한 Annotation
public class RealEstateController {
    private final RealEstateService service;

    @GetMapping("/main")
    public String main() {
        return "Hello Mobang!";
    }

    @GetMapping("/list")
    public String list() {
        return service.getList().toString();
    }
}
