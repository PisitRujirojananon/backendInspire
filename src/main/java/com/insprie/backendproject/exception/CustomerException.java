package com.insprie.backendproject.exception;

public class CustomerException extends Exception{

    public CustomerException(String code){
        super (code);
    }

    public static CustomerException customerSaveFail() {
        return new CustomerException("Failed, please try again later");
    }
}
