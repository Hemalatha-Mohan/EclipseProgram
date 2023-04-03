package com.crudspring.java.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//class product = EmpDetails
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="empDetails")
public class EmpDetails {
    @Id

    private int eid;

    @Column(name = "contact")
    private String contact;
    @Column(name = "Type")
    private String Type;
}
