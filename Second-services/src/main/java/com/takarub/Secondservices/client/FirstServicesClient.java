package com.takarub.Secondservices.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FIRST-SERVICE")
public interface FirstServicesClient {

    @GetMapping("/api/first/hello")
    public ResponseEntity<String> helloFromFirstServices();
}
