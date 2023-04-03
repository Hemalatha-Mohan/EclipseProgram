package com.example.phonebookgradle.examplegradlephonebook.controller;

import com.example.phonebookgradle.examplegradlephonebook.entity.Details;
import com.example.phonebookgradle.examplegradlephonebook.service.DetailsService;
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
