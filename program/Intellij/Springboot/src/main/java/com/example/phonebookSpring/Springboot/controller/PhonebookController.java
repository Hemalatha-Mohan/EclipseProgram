package com.example.phonebookSpring.Springboot.controller;

import com.example.phonebookSpring.Springboot.dto.Contact;
import com.example.phonebookSpring.Springboot.dto.Person1Response;
import com.example.phonebookSpring.Springboot.entity.Person1;
import com.example.phonebookSpring.Springboot.repository.Person1Repository;
import com.example.phonebookSpring.Springboot.repository.Phone1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PhonebookController {
    @Autowired
    private Person1Repository personRepository;
    @Autowired
    private Phone1Repository phoneRepository;


    //Method to get all contacts
    @GetMapping("/Contacts")
    public List<Person1> AllContact()
    {

        return personRepository.findAll();
    }

    //Method to add a new contact
    @PostMapping("/NewContact")
    public Person1 NewContact(@RequestBody Contact contact )
    {
        return personRepository.save(contact.getPerson1());
    }





}
