package com.hema.curd_operation.controller;

import com.hema.curd_operation.dto.EmployeeRequest;
import com.hema.curd_operation.model.Employee;
import com.hema.curd_operation.service.DepartmentService;
import com.hema.curd_operation.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("emp")

public class Employeecontroller {
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    @PostMapping("/save")

    public EmployeeRequest saveEmployee(@RequestBody EmployeeRequest request){
        return employeeService.saveEmployee(request);
    }
    @GetMapping("/get/{id}")
    Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeService.findById(id);
    }
    @PutMapping("/update")
    public EmployeeRequest updateEmployee(@RequestBody EmployeeRequest request){
        return employeeService.updateEmployee(request);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmp(id);
    }
}
