package com.hema.curd_operation.controller;

import com.hema.curd_operation.dto.DepartmentRequest;
import com.hema.curd_operation.model.Department;
import com.hema.curd_operation.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("dept")

public class Departmentcontroller {
    private final DepartmentService departmentService;
    @PostMapping("/save")
    public DepartmentRequest saveDepartment(@RequestBody DepartmentRequest request){
        return departmentService.saveDepartment(request);
    }
    @PutMapping("/update")
    public Department updateDepartment(@RequestBody Department request){
        return departmentService.updateDepartment(request);
    }

    @GetMapping(path = "/get/{id}")
    Optional<Department> getDepartment(@PathVariable(value = "id")Long id){
        return departmentService.getDepartmentById(id);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteDepartment(@PathVariable Long id){
        departmentService.deleteDept(id);
    }
}
