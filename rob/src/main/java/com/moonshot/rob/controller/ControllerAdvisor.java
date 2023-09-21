package com.moonshot.rob.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity handleDataAccessException(DataAccessException ex) {
        Exception error = new Exception(String.format("Database Error: %s", ex.getMessage()));
        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
