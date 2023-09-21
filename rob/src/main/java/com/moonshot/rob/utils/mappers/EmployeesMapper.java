package com.moonshot.rob.utils.mappers;

import com.moonshot.rob.model.CreateEmployeeRequest;
import com.moonshot.rob.model.CreateEmployeeResponse;
import com.moonshot.rob.model.Employee;
import com.moonshot.rob.model.GetEmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeesMapper {

    EmployeesMapper MAPPER = Mappers.getMapper( EmployeesMapper.class );

    Employee fromCreate(CreateEmployeeRequest request);
    CreateEmployeeResponse toCreateResponse(Employee employee);

    GetEmployeeResponse toGetResponse(Employee employee);
}
