package com.crudspring.java.dto;
//OrderRequest = EmpdetailsRequest

import com.crudspring.java.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpdetailsRequest {
    private Employee employee;
}
