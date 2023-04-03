package com.example.phonebookSpring.Springboot.repository;

import com.example.phonebookSpring.Springboot.entity.Phone1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Phone1Repository extends JpaRepository<Phone1,Integer> {
}
