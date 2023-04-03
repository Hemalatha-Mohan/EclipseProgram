package com.example.phonebookSpring.Springboot.repository;

import com.example.phonebookSpring.Springboot.dto.Person1Response;
import com.example.phonebookSpring.Springboot.entity.Person1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface Person1Repository extends JpaRepository<Person1,Integer> {
    /*@Query("select new.com.example.phonebookSpring.Springboot.dto.People1Response( p.fname,ph.number) from person1 p join p.phone1 ph ")
    public List<Person1Response> getJoinInformation();*/
}
