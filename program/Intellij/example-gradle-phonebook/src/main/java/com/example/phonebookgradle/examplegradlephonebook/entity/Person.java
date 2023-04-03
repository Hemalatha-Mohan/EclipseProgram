package com.example.phonebookgradle.examplegradlephonebook.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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
    public Person(int i, String firstName, String lastName, String s){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", details=" + details +
                '}';
    }
}
