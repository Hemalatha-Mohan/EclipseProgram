package com.example.phonebookSpring.Springboot.dto;

import com.example.phonebookSpring.Springboot.entity.Person1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Contact {

    private Person1 person1;
}
