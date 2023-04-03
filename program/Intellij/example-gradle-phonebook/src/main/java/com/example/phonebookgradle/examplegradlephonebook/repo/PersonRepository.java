package com.example.phonebookgradle.examplegradlephonebook.repo;

import com.example.phonebookgradle.examplegradlephonebook.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository

public interface PersonRepository extends JpaRepository<Person,Integer> {


   public List<Person> findByFirstName(String firstName);

   @Transactional
   @Modifying
   public int deleteByFirstName(String firstName);

   /*@Modifying
   public int deleteByName(String firstName, String lastName);
*/



}
