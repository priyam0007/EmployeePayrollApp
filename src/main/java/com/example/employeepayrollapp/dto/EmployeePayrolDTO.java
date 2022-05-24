package com.example.employeepayrollapp.dto;

import java.time.LocalDate;
public class EmployeePayrolDTO {
    private String fName;
    private String lName;
    private String company;
    private String roll;
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

