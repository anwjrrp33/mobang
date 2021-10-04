package com.mobang.controller;

import com.mobang.entity.RealEstate;
import com.mobang.service.RealEstateService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/realestate")
@RequiredArgsConstructor //자동 주입을 위한 Annotation
public class RealEstateController {
    private final RealEstateService service;

    @GetMapping("/main")
    public String main() {
        return "Hello Mobang!";
    }

//    @GetMapping("/list")
//    public String list() {
//        return service.getList().toString();
//    }

    @GetMapping("/list")
    public ResponseEntity<List<RealEstate>> list() {
        // msg = {"name" : "홍길동"}
        // String msg = service.getList().toString();

        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<>(service.getList(), header, HttpStatus.OK);
    }

    @GetMapping("/detail")
    public ResponseEntity<RealEstate> detail(@Param("id") Long id) {
        // msg = {"name" : "홍길동"}
        // String msg = service.getList().toString();

        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<>(service.getDetail(id), header, HttpStatus.OK);
    }
}
