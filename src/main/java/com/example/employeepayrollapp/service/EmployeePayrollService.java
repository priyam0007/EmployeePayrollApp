package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;
import com.example.employeepayrollapp.exceptions.EmployeePayrollException;
import com.example.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class EmployeePayrollService implements IEmployeeService {
    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    private List<EmployeePayrolData> employeePayrolDataList = new ArrayList<>();

    @Override
    public List<EmployeePayrolData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    @Override
    public EmployeePayrolData getEmployeePayrollDataById(int id) {
        return employeePayrollRepository.findById(id).orElseThrow(() -> new EmployeePayrollException("Employee with id" + id + "does not exist..!!"));
    }

    @Override
    public EmployeePayrolData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrolData employeePayrolData = new EmployeePayrolData(employeePayrolDTO);
        log.debug("empData" + employeePayrolData.toString());
        employeePayrolDataList.add(employeePayrolData);
        return employeePayrollRepository.save(employeePayrolData);
    }

    public EmployeePayrolData updateEmployeePayrollData(int id, EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrolData employeePayrolData = this.getEmployeePayrollDataById(id);
        employeePayrolData.updateEmployeePayrolData(employeePayrolDTO);
        return employeePayrollRepository.save(employeePayrolData);
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        EmployeePayrolData employeePayrolData = this.getEmployeePayrollDataById(id);
        employeePayrollRepository.delete(employeePayrolData);
    }
}