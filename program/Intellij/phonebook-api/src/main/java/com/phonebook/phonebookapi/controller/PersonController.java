package com.phonebook.phonebookapi.controller;

import com.phonebook.phonebookapi.entity.Person;

import com.phonebook.phonebookapi.repo.PersonRepository;

import com.phonebook.phonebookapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")

public class PersonController {
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository personRepository;


    @GetMapping
    private List<Person> getAll(){

        return personService.getAll();
    }
    @GetMapping("/{id}")
    private Person getById(@PathVariable int id){

        return personService.getById(id);
    }
    @GetMapping("/firstName")
    private ResponseEntity <List<Person>> getByFirstName(@RequestParam String firstName){
        return personService.getContactByFirstName(firstName);
    }
    @PostMapping
    private Person add(@RequestBody Person person){

        return personService.addOrUpdate(person);
    }
    @PutMapping("/{id}")
    private Person update(@PathVariable int id, @RequestBody Person person){
        person.setPersonId(id);
        return personService.addOrUpdate(person);
    }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id){

        personService.deleteById(id);
    }
   @DeleteMapping("/DeleteByFirstName")
    public String deleteByFirstName(@RequestParam String firstName){
        return personService.deleteByFirstName(firstName)+"deleted";
    }



/*
    @DeleteMapping("/deleteByFnameAndLname")
    public String deleteContactByName(@RequestParam String firstname,@RequestParam String lastname)
    {
        return personService.deleteByFirstnameAndLastname(firstname,lastname) + " Contact deleted !!";
    }

   @DeleteMapping("/DeleteByName")
    public String deleteByName(@RequestParam String firstName,@RequestParam String lastName){
        return personService.deleteByFnameAndLname(firstName,lastName)+"deleted Successfully";
    }

   */






}
