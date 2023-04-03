package com.crud.operation2.countries.controllers;

import com.crud.operation2.countries.entity.City;
import com.crud.operation2.countries.entity.Country;
import com.crud.operation2.countries.service.CityService;
import com.crud.operation2.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")

public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    private List<Country> getAll(){
        return  countryService.getAll();
    }
    @GetMapping("/{id}")
    private Country getById(@PathVariable int id){
        return countryService.getById(id);
    }

   /* @GetMapping("/name")
    private Country getByName(@PathVariable String name){
        return countryService.
    }*/
    @PostMapping
    private Country add(@RequestBody Country country){
        return countryService.addOrUpdate(country);
    }
    @PutMapping("/{id}")
    private Country update(@PathVariable int id, @RequestBody Country country){
        country.setCountryId(id);
        return countryService.addOrUpdate(country);
    }
    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable int id){
        countryService.deleteById(id);
    }


}
