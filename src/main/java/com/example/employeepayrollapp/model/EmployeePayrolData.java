package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class EmployeePayrolData {
    private int id;
    private String fName;
    private String lName;
    private String company;
    private String roll;
    private int salary;
    public EmployeePayrolData() {
    }

    public EmployeePayrolData(int id, EmployeePayrolDTO employeePayrolDTO) {
        this.id = id;
        this.fName = employeePayrolDTO.getfName();
        this.lName = employeePayrolDTO.getlName();
        this.company = employeePayrolDTO.getCompany();
        this.roll = employeePayrolDTO.getRoll();
        this.salary = employeePayrolDTO.getSalary();
    }
}
