package com.hema.curd_operation.dto;

import lombok.Data;

import java.time.LocalDate;

@Data

public class EmployeeRequest {
    private Long id;
    private  String code;
    private  String name;
    private LocalDate dob;
    private String gender;
    private String mobile;
    private Long department;
}
