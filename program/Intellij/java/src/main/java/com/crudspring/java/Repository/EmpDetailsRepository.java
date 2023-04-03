package com.crudspring.java.Repository;

import org.springframework.stereotype.Repository;



import com.crudspring.java.entity.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface EmpDetailsRepository extends JpaRepository<EmpDetails,Integer> {
}
