package com.takarub.Gateway.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {

    private int status;

    private boolean success;

    private Error error;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Error{

        private String code;

        private String message;

    }
}
