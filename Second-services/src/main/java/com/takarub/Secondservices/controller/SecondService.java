package com.takarub.Secondservices.controller;

import com.takarub.Secondservices.client.FirstServicesClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/second")
@RequiredArgsConstructor
public class SecondService {

    private final FirstServicesClient client;
    @GetMapping("/hello")
    public ResponseEntity<String> helloFromFirstServices(){
        ResponseEntity<String> stringResponseEntity = client.helloFromFirstServices();
        String body = stringResponseEntity.getBody();
        String string = stringResponseEntity.toString();
        return ResponseEntity.status(HttpStatus.OK)
                .body("this message came from second Services ++++++ " +body);
    }
}
