package com.moonshot.rob.controller;

import com.moonshot.rob.model.CreateEmployeeRequest;
import com.moonshot.rob.model.CreateEmployeeResponse;
import com.moonshot.rob.model.GetEmployeeResponse;
import com.moonshot.rob.service.EmployeeService;
import com.moonshot.rob.utils.exceptions.BadRequestException;
import com.moonshot.rob.utils.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private EmployeeService service;

    public RestController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/employee/add")
    public ResponseEntity<CreateEmployeeResponse> createEmployee(@RequestBody CreateEmployeeRequest request) throws BadRequestException {
        /**
         * 200 when an object is created and returned
         * 201 when an object is created but only its reference is returned (such as an ID or a link)
         */
        return ResponseEntity.ok(service.createEmployee(request));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<GetEmployeeResponse> getEmployee(@PathVariable Long id) throws NotFoundException {
        return ResponseEntity.ok(service.getEmployeeById(id));
    }
}
