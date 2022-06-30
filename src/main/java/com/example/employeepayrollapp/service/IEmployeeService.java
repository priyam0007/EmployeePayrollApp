package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;

import java.util.List;

public interface IEmployeeService {
    List<EmployeePayrolData> getEmployeePayrollData();
    EmployeePayrolData getEmployeePayrollDataById(int id);
    List<EmployeePayrolData> getEmployeesByDepartment(String department);
    EmployeePayrolData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO);
    EmployeePayrolData updateEmployeePayrollData(int id,EmployeePayrolDTO employeePayrolDTO);
    void deleteEmployeePayrollData(int id);
}

