package com.insprie.backendproject.service;

import com.insprie.backendproject.entity.Customer;
import com.insprie.backendproject.exception.CustomerException;
import com.insprie.backendproject.repository.CustomerRepository;
import com.insprie.backendproject.request.CustomerRequest;
import com.insprie.backendproject.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerResponse saveCustomerContact(CustomerRequest customerRequest) throws CustomerException {
        CustomerResponse response = new CustomerResponse();

        Customer customer = new Customer();
            customer.setCustomername(customerRequest.getCustomername());
            customer.setCustomeremail(customerRequest.getCustomeremail());
            customer.setCustomerbirthday(customerRequest.getCustomerbirthday());
            customer.setCustomergender(customerRequest.getCustomergender());
            customer.setCustomerphonenumber(customerRequest.getCustomerphonenumber());

        Customer result = customerRepository.save(customer);
        if(result.getCustomeremail() != null){
                response.setStatus(HttpStatus.OK.value());
                response.setMessage("Saved");
            return response;
        }

        throw CustomerException.customerSaveFail();
    }
}
