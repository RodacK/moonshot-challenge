package com.moonshot.rob.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ws.client.WebServiceClientException;

import java.net.ConnectException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ControllerAdvisor {

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity handleDataAccessException(DataAccessException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", String.format("Database Error: %s", ex.getMessage()));
        log.error(ex.getMessage());
        return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ConnectException.class)
    public ResponseEntity handleConnectException(ConnectException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "External Services Error: Tenemos dependencias faltantes, comuniquese con un admin");
        log.error(ex.getMessage());
        return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity handleIllegalStateException(IllegalStateException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Internal Error: Comuniquese con un admin");
        log.error(ex.getMessage());
        return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(WebServiceClientException.class)
    public ResponseEntity handleWebServiceClientException(WebServiceClientException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Internal Error: Comuniquese con un admin");
        log.error(ex.getMessage());
        return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
