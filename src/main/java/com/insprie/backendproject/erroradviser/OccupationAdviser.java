package com.insprie.backendproject.erroradviser;

import com.insprie.backendproject.ErrorResponse;
import com.insprie.backendproject.exception.CustomerException;
import com.insprie.backendproject.exception.OccupationException;
import com.insprie.backendproject.response.CustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OccupationAdviser {

    @ExceptionHandler(OccupationException.class)
    public ResponseEntity<ErrorResponse> handleOccupationException(OccupationException e) {
        ErrorResponse response = new ErrorResponse();
            response.setError(e.getMessage());
            response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<CustomerResponse> handleCustomerException(CustomerException e) {
        CustomerResponse response = new CustomerResponse();
            response.setMessage(e.getMessage());
            response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }
}
