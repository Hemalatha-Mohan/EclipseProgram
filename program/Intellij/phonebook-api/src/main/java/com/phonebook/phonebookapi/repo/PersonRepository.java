package com.phonebook.phonebookapi.repo;

import com.phonebook.phonebookapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository

public interface PersonRepository extends JpaRepository<Person,Integer> {


   public List<Person> findByFirstName(String firstName);

   @Transactional
   @Modifying
   public int deleteByFirstName(String firstName);


  /* @Modifying
   public int deleteByName(String firstName, String lastName);



  /* @Transactional
   @Modifying
   public  int deleteByFnameAndLname(String firstName ,String lastName );



   */


}
