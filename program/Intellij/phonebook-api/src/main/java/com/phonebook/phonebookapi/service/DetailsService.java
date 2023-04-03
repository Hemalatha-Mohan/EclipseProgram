package com.phonebook.phonebookapi.service;

import com.phonebook.phonebookapi.entity.Details;
import com.phonebook.phonebookapi.repo.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DetailsService {
    @Autowired
    private DetailsRepository detailsRepository;
    public Details addOrUpdate(Details details){

        return detailsRepository.save(details);
    }
    public boolean deleteById(int id){
        detailsRepository.deleteById(id);
        return true;
    }
    public List<Details> getAll(){
        return detailsRepository.findAll();

    }
    public Details getById(int id){

        return detailsRepository.findById(id).get();
    }
}
