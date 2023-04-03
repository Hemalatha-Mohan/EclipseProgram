package com.crudspring.java.Repository;

import com.crudspring.java.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//CustomerRepository=EmployeeRepository
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
