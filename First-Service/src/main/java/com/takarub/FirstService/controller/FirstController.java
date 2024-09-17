package com.takarub.FirstService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/first")
public class FirstController {


    @GetMapping("/hello")
    public ResponseEntity<String> helloFromFirstServices(){
        return ResponseEntity.status(HttpStatus.OK).body("this message came from First Services");
    }
}
