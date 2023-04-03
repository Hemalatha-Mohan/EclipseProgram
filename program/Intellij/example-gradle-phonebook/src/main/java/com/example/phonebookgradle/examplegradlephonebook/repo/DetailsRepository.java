package com.example.phonebookgradle.examplegradlephonebook.repo;

import com.example.phonebookgradle.examplegradlephonebook.entity.Details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details,Integer> {
}
