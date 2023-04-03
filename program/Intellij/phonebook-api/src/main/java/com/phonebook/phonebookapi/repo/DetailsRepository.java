package com.phonebook.phonebookapi.repo;

import com.phonebook.phonebookapi.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details,Integer> {
}
