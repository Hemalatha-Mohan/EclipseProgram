package com.crudspring.java.Controller;

import com.crudspring.java.Repository.EmpDetailsRepository;
import com.crudspring.java.Repository.EmployeeRepository;
import com.crudspring.java.dto.EmpdetailsRequest;
import com.crudspring.java.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//OrderController=EmpDetailsController
@RestController

public class EmpDetailscontroller {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmpDetailsRepository empDetailsRepository;
    //@PostMapping("/placeOrder")="employee"
    @PostMapping("/employees")
    public Employee newemployee(@RequestBody EmpdetailsRequest request){
        return employeeRepository.save(request.getEmployee());
    }

    //@GetMapping("/findAllOrders")=findAllEmpDetails

    @GetMapping("/findAllEmpDetails")
    public List<Employee> findAllEmpDetails()
    {

        return employeeRepository.findAll();
    }
}
