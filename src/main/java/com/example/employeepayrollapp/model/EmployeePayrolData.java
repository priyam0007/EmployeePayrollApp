package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class EmployeePayrolData {
    private int id;
    private String fName;
    private String lName;
    private String company;
    private String roll;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

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
