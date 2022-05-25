package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.model.EmployeePayrolData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrolData,Integer> {
}
