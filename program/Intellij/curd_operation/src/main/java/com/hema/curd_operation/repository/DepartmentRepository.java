package com.hema.curd_operation.repository;

import com.hema.curd_operation.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
