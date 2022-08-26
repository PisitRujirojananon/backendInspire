package com.insprie.backendproject.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomerException extends Exception {

    public CustomerException(String code){
        super (code);
    }

    public static CustomerException customerSaveFail() {
        return new CustomerException("Failed, please try again later");
    }

    public static CustomerException requestNull() {
        return new CustomerException("Request is null");
    }
}
