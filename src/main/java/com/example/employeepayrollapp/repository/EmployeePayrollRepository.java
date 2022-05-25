package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.model.EmployeePayrolData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrolData,Integer> {
    @Query(value = "select * from employee_data, employee_department where emp_id = id and department = :department", nativeQuery = true)
    List<EmployeePayrolData> findEmployeesByDepartment(String department);
}
