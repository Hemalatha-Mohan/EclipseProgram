package com.hema.curd_operation.model;

import com.hema.curd_operation.enums.GenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(EntityListeners.class)

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 4)
    private String code;
    @Column(nullable = false, length = 35)
    private String name;
    private LocalDate dob;
    private GenderEnum gender;
    private String mobile;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
