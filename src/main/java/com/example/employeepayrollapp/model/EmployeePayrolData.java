package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrolData {
    private int id;
    private String fName;
    private int salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private  String profilePic;
    private List<String> department;
    public EmployeePayrolData() {
    }
    public EmployeePayrolData(int id, EmployeePayrolDTO employeePayrolDTO) {
        this.id = id;
        this.fName=employeePayrolDTO.getFName();
        this.salary = employeePayrolDTO.getSalary();
        this.gender=employeePayrolDTO.getGender();
        this.startDate = employeePayrolDTO.getStartDate();
        this.note = employeePayrolDTO.getNote();
        this.profilePic=employeePayrolDTO.getProfilePic();
        this.department=employeePayrolDTO.getDepartment();
    }
}