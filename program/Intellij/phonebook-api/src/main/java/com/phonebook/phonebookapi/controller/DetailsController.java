package com.phonebook.phonebookapi.controller;

import com.phonebook.phonebookapi.entity.Details;
import com.phonebook.phonebookapi.repo.DetailsRepository;
import com.phonebook.phonebookapi.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")

public class DetailsController {
    @Autowired
    private DetailsService detailsService;


    @GetMapping
    private List<Details> getAll(){

        return  detailsService.getAll();
    }
    @GetMapping("/{id}")
    private Details getById(@PathVariable int id){

        return detailsService.getById(id);
    }
    @PostMapping
    private Details add(@RequestBody Details details){
        return detailsService.addOrUpdate(details);
    }
    @PutMapping("/{id}")
    private Details update(@PathVariable int id, @RequestBody Details details){
        details.setDetailId(id);
        return detailsService.addOrUpdate(details);
    }
    @DeleteMapping("/{id}")
    public void deleteDetails(@PathVariable int id){
        detailsService.deleteById(id);
    }

}
