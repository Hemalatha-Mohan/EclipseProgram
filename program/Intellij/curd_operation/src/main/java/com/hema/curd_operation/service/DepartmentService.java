package com.hema.curd_operation.service;

import com.hema.curd_operation.dto.DepartmentRequest;
import com.hema.curd_operation.model.Department;

import java.util.Optional;

public interface DepartmentService {

    DepartmentRequest saveDepartment(DepartmentRequest request);


    Department updateDepartment(Department request);
    Optional<Department> getDepartmentById(Long id);
    void deleteDept(Long id);

}
