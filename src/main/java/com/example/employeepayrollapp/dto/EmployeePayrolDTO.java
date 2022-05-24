package com.example.employeepayrollapp.dto;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data

public class EmployeePayrolDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname cannot be empty and null")
    private String fName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname cannot be empty and null")
    private String lName;
    @NotEmpty(message = "Company name should not be empty")
    private String company;
    private String roll;
    @Min(value = 500, message = "Min salary should be more than 500")
    private int salary;


    public EmployeePayrolDTO(String fName, String lName, String company, String roll, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.company = company;
        this.roll = roll;
        this.salary = salary;
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
    @Override
    public String toString() {
        return "EmployeePayrolDTO{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", company='" + company + '\'' +
                ", roll='" + roll + '\'' +
                ", salary=" + salary +
                '}';
    }
}