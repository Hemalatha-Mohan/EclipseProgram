package com.example.phonebookgradle.examplegradlephonebook.service;

import com.example.phonebookgradle.examplegradlephonebook.entity.Person;
import com.example.phonebookgradle.examplegradlephonebook.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person addOrUpdate(Person person) {
        return personRepository.save(person);
    
    }

    public boolean deleteById(int id) {
        personRepository.deleteById(id);
        return true;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(int id) {
        return personRepository.findById(id).get();
    }

    public int deleteByFirstName(@RequestParam String firstName)
    {

        return personRepository.deleteByFirstName(firstName);
    }



/*public Integer deleteByName(@RequestParam String firstName,@RequestParam String lastName)
    {
        return personRepository. deleteByName(firstName, lastName);
    }*/

    public ResponseEntity<List<Person>> getContactByFirstName(@RequestParam String firstname)
    {
        return new ResponseEntity<List<Person>>(personRepository.findByFirstName(firstname), HttpStatus.OK);

    }


}
