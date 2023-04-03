package com.example.phonebookSpring.Springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="phone1")
public class Phone1 {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
    @Column(name="number")
    private String number;
    @Column(name = "type")
    private String type;

}
