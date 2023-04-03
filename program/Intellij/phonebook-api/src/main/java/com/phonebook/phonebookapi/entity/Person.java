package com.phonebook.phonebookapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data

//@Table(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private String firstName;

    private String lastName;
    private String email;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name = "pId",referencedColumnName = "personId")
    private List<Details>details;
    //
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }


}
