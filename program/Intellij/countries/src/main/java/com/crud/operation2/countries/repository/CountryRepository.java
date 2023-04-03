package com.crud.operation2.countries.repository;

import com.crud.operation2.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
