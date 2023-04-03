package com.example.phonebookSpring.Springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="person1")
public class Person1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fname")
    private String fname;
    @Column(name="lname")
    private String lname;
    @OneToMany(targetEntity = Phone1.class, cascade = CascadeType.ALL)
    @JoinColumn(name="person_id",referencedColumnName = "id")
    private List<Phone1> phones;

}