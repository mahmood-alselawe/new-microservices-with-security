package com.takarub.Gateway.handdleException;

import com.takarub.Gateway.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class HandleException {


    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErrorResponse> handleError(ResponseStatusException e){

        return ResponseEntity.status(e.getStatusCode())
                .body(ErrorResponse
                        .builder()
                        .success(false)
                        .status(e.getStatusCode().value())
                        .error(new ErrorResponse.Error(e.getReason(), e.getMessage()))
                        .build()
                );
    }



}

