package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollService implements IEmployeeService {
    private List<EmployeePayrolData> employeePayrolDataList=new ArrayList<>();
    @Override
    public List<EmployeePayrolData> getEmployeePayrollData() {
        return employeePayrolDataList;
    }

    @Override
    public EmployeePayrolData getEmployeePayrollDataById(int id) {
        return employeePayrolDataList.get(id-1);
    }

    @Override
    public EmployeePayrolData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrolData employeePayrolData=new EmployeePayrolData(employeePayrolDataList.size()+1,employeePayrolDTO);
        employeePayrolDataList.add(employeePayrolData);
        return employeePayrolData;
    }

    @Override
    public EmployeePayrolData updateEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
        return null;
    }

    public EmployeePayrolData updateEmployeePayrollData(int id, EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrolData employeePayrolData=this.getEmployeePayrollDataById(id);
        employeePayrolData.setfName(employeePayrolDTO.getfName());
        employeePayrolData.setlName(employeePayrolDTO.getlName());
        employeePayrolData.setCompany(employeePayrolDTO.getCompany());
        employeePayrolData.setRoll(employeePayrolDTO.getRoll());
        employeePayrolData.setSalary(employeePayrolDTO.getSalary());
        employeePayrolDataList.set(id-1,employeePayrolData);
        return employeePayrolData;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        employeePayrolDataList.remove(id-1);
    }
}