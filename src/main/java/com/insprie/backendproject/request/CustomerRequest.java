package com.insprie.backendproject.request;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerRequest {

    private String customername;

    private Date customerbirthday;

    private String customergender;

    private String customerphonenumber;

    private String customeremail;
}
