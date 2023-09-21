package com.moonshot.rob.service;

import com.moonshot.rob.configs.SoapClient;
import com.moonshot.rob.model.CreateEmployeeRequest;
import com.moonshot.rob.model.CreateEmployeeResponse;
import com.moonshot.rob.model.Employee;
import com.moonshot.rob.model.GetEmployeeResponse;
import com.moonshot.rob.model.wsdl.ObjectFactory;
import com.moonshot.rob.repository.EmployeesRepository;
import com.moonshot.rob.utils.exceptions.BadRequestException;
import com.moonshot.rob.utils.exceptions.NotFoundException;
import com.moonshot.rob.utils.mappers.EmployeesMapper;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private EmployeesRepository repository;
    private ValidatorFactory factory;
    private SoapClient soapClient;

    //also we can inject the dependencies via constructor
    EmployeeService(EmployeesRepository repository, SoapClient soapClient) {
        this.repository = repository;
        this.soapClient = soapClient;
        factory = Validation.buildDefaultValidatorFactory();
    }

    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest request) throws BadRequestException {
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<CreateEmployeeRequest>> violations = validator.validate(request);

        if (violations.isEmpty()) {
            Employee toSave = EmployeesMapper.MAPPER.fromCreate(request);
            com.moonshot.rob.model.wsdl.Add addRequest = new com.moonshot.rob.model.wsdl.Add();
            addRequest.setArg0(toSave.getSalary());
            addRequest.setArg1(1000);
            ObjectFactory objectFactory = new ObjectFactory();
            toSave.setSalary(soapClient.add(objectFactory.createAdd(addRequest)).getReturn());
            System.out.println("----------------"+toSave.getSalary());
            return EmployeesMapper.MAPPER.toCreateResponse(repository.save(toSave));
        } else {
            throw new BadRequestException(violations.stream().map(a -> a.getPropertyPath()+" : "+a.getMessage()).collect(Collectors.toList()).toString());
        }
    }

    public GetEmployeeResponse getEmployeeById(Long id) throws NotFoundException {
        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()){
            return EmployeesMapper.MAPPER.toGetResponse(result.get());
        } else {
            throw new NotFoundException(String.format("Employee with id: %s not fund", id));
        }
    }
}
