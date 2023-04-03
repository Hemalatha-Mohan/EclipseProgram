package com.hema.curd_operation.service.impl;

import com.hema.curd_operation.dto.EmployeeRequest;
import com.hema.curd_operation.enums.GenderEnum;
import com.hema.curd_operation.model.Employee;
import com.hema.curd_operation.repository.DepartmentRepository;
import com.hema.curd_operation.repository.EmployeeRepository;
import com.hema.curd_operation.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;
    private final DepartmentRepository departmentRepository;
    @Override
    public EmployeeRequest saveEmployee(EmployeeRequest request) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(request, employee);
        if(request.getGender().equals("Male")){
            employee.setGender(GenderEnum.MALE);
        } else if (request.getGender().equals("Female")) {
            employee.setGender(GenderEnum.FEMALE);
        }else {
            employee.setGender(GenderEnum.OTHERS);
        }
        employee.setDepartment(departmentRepository.getById(request.getDepartment()));
         Employee emp = repository.save(employee);
        System.out.println(emp);
        return request;
    }

    @Override
    public EmployeeRequest updateEmployee(EmployeeRequest request) {
        Employee emp = new Employee();
        Optional<Employee> getEmp = repository.findById(request.getId());
        Employee employee = getEmp.get();
        BeanUtils.copyProperties(request,employee);
        if(request.getGender().equals("Male")){
            employee.setGender(GenderEnum.MALE);
        } else if (request.getGender().equals("Females")) {
            employee.setGender(GenderEnum.FEMALE);

        }else {
            employee.setGender(GenderEnum.OTHERS);
        }
        employee.setDepartment(departmentRepository.getById(request.getDepartment()));
        Employee emp1 =repository.save(employee);
        System.out.println(emp1);
        return request;
    }

    @Override
    public Optional<Employee> findById(Long id) {
        Optional<Employee> employee = repository.findById(id);
        return employee;
    }

    @Override
    public void deleteEmp(Long id) {
     Optional<Employee> getEmp = repository.findById(id);
     Employee employee = getEmp.get();
     repository.delete(employee);
     }
}
