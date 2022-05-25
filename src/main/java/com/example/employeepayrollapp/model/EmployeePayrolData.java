package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "employee_data")
public class EmployeePayrolData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "emp_id")
    private String fName;
    private int salary;
    private String gender;
    @Column(name = "start_date")
    private LocalDate startDate;
    private String note;
    private  String profilePic;
    @ElementCollection
    @CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name ="id" ))
    @Column(name = "department")
    private List<String> department;
    public EmployeePayrolData(EmployeePayrolDTO employeePayrolDTO) {
        this.updateEmployeePayrolData(employeePayrolDTO);
    }

    public EmployeePayrolData() {

    }

    public void updateEmployeePayrolData(EmployeePayrolDTO employeePayrolDTO) {
        this.fName=employeePayrolDTO.getFName();
        this.salary = employeePayrolDTO.getSalary();
        this.gender=employeePayrolDTO.getGender();
        this.startDate = employeePayrolDTO.getStartDate();
        this.note = employeePayrolDTO.getNote();
        this.profilePic=employeePayrolDTO.getProfilePic();
        this.department=employeePayrolDTO.getDepartment();
    }
}