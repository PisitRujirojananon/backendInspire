package com.insprie.backendproject.controller;

import com.insprie.backendproject.exception.CustomerException;
import com.insprie.backendproject.request.CustomerRequest;
import com.insprie.backendproject.response.CustomerResponse;
import com.insprie.backendproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController

public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public CustomerResponse saveCustomerContact(@RequestBody CustomerRequest customerRequest) throws CustomerException {
        if(customerRequest.getCustomername() == null){
            throw CustomerException.requestNull();
        }
        if (customerRequest.getCustomergender() == null){
            throw CustomerException.requestNull();
        }
        if (customerRequest.getCustomerbirthday() == null){
            throw CustomerException.requestNull();
        }
        if (customerRequest.getCustomerphonenumber() == null){
            throw CustomerException.requestNull();
        }
        if (customerRequest.getCustomeremail() == null){
            throw CustomerException.requestNull();
        }

        return customerService.saveCustomerContact(customerRequest);
    }
}
