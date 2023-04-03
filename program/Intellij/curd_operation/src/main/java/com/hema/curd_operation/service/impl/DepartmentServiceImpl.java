package com.hema.curd_operation.service.impl;

import com.hema.curd_operation.dto.DepartmentRequest;
import com.hema.curd_operation.model.Department;
import com.hema.curd_operation.repository.DepartmentRepository;
import com.hema.curd_operation.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;



    @Override
    public DepartmentRequest saveDepartment(DepartmentRequest request) {
        Department department = new Department();
        department.setName(request.getName());
        department.setStatus(request.isStatus());
        Department req =departmentRepository.save(department);
        return null;
    }


    @Override
    public Department updateDepartment(Department request) {

        return departmentRepository.save(request);
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public void deleteDept(Long id) {
        Optional<Department> getDept = departmentRepository.findById(id);
        Department department = getDept.get();
        departmentRepository.delete(department);

    }
}
