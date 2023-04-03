package com.sandhata.training.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/employees")

public class EmployeeController {


    private EmployeeDAO employeeDao=new EmployeeDAO();

    // Implementing a GET method
    // to get the list of all
    // the employees
    @GetMapping(
            path = "/all",
            produces = "application/json")

    public Employees getEmployees()
    {

        return employeeDao
                .getAllEmployees();
    }


    // Create a POST method
    // to add an employee
    // to the list
    @PostMapping(
            path = "/add",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addEmployee(
            @RequestBody Employee employee)
    {

        // Creating an ID of an employee
        // from the number of employees
        Integer id
                = employeeDao
                .getAllEmployees()
                .getEmployeeList()
                .size()
                + 1;

        employee.setId(id);

        employeeDao
                .addEmployee(employee);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        employee.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}
