package com.crudspring.java.entity;
//class Customer= Employee

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="employee1")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="name")
    private String name;
    @Column(name="department")
    private String department;

    @OneToMany(targetEntity = EmpDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "e_fk",referencedColumnName = "id")

    private List<EmpDetails> empDetails;
}
