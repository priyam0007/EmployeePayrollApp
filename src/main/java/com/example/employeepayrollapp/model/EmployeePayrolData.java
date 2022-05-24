package com.example.employeepayrollapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class EmployeePayrolData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fName;
    private String lName;
    private String company;
    private String roll;
    private Long salary;
    public LocalDate startDate;
}

