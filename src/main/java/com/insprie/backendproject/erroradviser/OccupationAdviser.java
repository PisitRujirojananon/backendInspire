package com.insprie.backendproject.erroradviser;

import com.insprie.backendproject.ErrorResponse;
import com.insprie.backendproject.exception.OccupationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OccupationAdviser {

    @ExceptionHandler(OccupationException.class)
    public ResponseEntity<ErrorResponse> handleOccupationException(OccupationException e) {
        ErrorResponse response =new ErrorResponse();
            response.setError(e.getMessage());
            response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }
}
