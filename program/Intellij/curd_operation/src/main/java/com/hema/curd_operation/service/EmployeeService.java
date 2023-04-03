package com.hema.curd_operation.service;

import com.hema.curd_operation.dto.EmployeeRequest;
import com.hema.curd_operation.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    EmployeeRequest saveEmployee(EmployeeRequest request);
    EmployeeRequest updateEmployee(EmployeeRequest request);
    Optional<Employee> findById(Long id);
    void deleteEmp(Long id);
}
