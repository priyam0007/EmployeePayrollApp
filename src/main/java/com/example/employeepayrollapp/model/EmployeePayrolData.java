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
    @Column(name = "emp_id")
    private int id;
    @Column(name = "name")
    private String name;
    private int salary;
    private String gender;
    @Column(name = "start_date")
    private String startDate;
    private String note;
    private  String profilePic;
    @ElementCollection
    @CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name ="id" ))
    @Column(name = "departments")
    private List<String> departments;
    public EmployeePayrolData(EmployeePayrolDTO employeePayrolDTO) {
        this.updateEmployeePayrolData(employeePayrolDTO);
    }

    public EmployeePayrolData() {

    }

    public void updateEmployeePayrolData(EmployeePayrolDTO employeePayrolDTO) {
        this.name=employeePayrolDTO.getName();
        this.salary = employeePayrolDTO.getSalary();
        this.gender=employeePayrolDTO.getGender();
        this.startDate = employeePayrolDTO.getStartDate();
        this.note = employeePayrolDTO.getNote();
        this.profilePic=employeePayrolDTO.getProfilePic();
        this.departments=employeePayrolDTO.getDepartments();
    }
}

