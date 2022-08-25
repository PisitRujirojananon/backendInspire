package com.insprie.backendproject.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerResponse {

    private LocalDateTime timestamp = LocalDateTime.now();

    private int status;

    private String message;
}
