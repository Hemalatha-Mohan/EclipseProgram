package com.example.phonebookgradle.examplegradlephonebook;

import com.example.phonebookgradle.examplegradlephonebook.entity.Person;
import com.example.phonebookgradle.examplegradlephonebook.repo.PersonRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//inorder to use spring data jpi for test class

//@TestPropertySource(locations = "classpath:applicationtest.properties")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//inorder to run the test against the real database//none- meaning thet
//the test will be executed against the real database instead of the default in memory database

public class PersonRepositoryTests {
    @Autowired
    private PersonRepository personRepository;

    // to add a new record in the person table
    @Test
    //to keep data commited to the database

    public void testAddNew(){

       Person person = new Person();
       person.setEmail("hemam.mohan@gmail.com");
       person.setFirstName("Hemalatha");
       person.setLastName("Thangarajan");

       Person savedPerson = personRepository.save(person);
      assertThat(savedPerson).isNotNull();
      assertThat(savedPerson.getPersonId()).isGreaterThan(0);
      System.out.println("Record inserted successfully");

    }


    //to get all datas from the person table
    @Test
    public void testListAll(){
        Iterable<Person> persons = personRepository.findAll();
        assertThat(persons).hasSizeGreaterThan(0);

        for(Person person : persons){
            System.out.println(person);

        }
    }
    //to update a data in person table
    @Test
    public void testUpdate(){
        Integer personId = 3;
        Optional<Person> optionalPerson = personRepository.findById(personId);
        Person person = optionalPerson.get();
        person.setLastName("Mohan");
        personRepository.save(person);

        Person updatePerson = personRepository.findById(personId).get();
        assertThat(updatePerson.getLastName()).isEqualTo("Mohan");

    }
    //get user by Id
    @Test
    public void testGetById(){
        Integer personId = 2;
        Optional<Person> optionalPerson = personRepository.findById(personId);
        assertThat(optionalPerson).isPresent();
        System.out.println(optionalPerson.get());

    }
    // to delete a record by Id
    @Test
    public void testDeleteById(){
        Integer personId = 4;
        personRepository.deleteById(personId);
        Optional<Person> optionalPerson = personRepository.findById(personId);
        assertThat(optionalPerson).isNotPresent();

    }

}
