package com.example.springdemo.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {


    @Id// making id as primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // autogenrated this value
    private Long id;

    private String name;
    private LocalDate dateOfJoining;
    private Boolean isActive;


}
