package com.crud.operation2.countries.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cId",referencedColumnName = "countryId")
    private List<City>cities;
}
