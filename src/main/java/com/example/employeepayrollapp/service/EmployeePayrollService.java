package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;
import com.example.employeepayrollapp.exceptions.EmployeePayrollException;
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
        return employeePayrolDataList.stream().filter(employeePayrolData -> employeePayrolData.getId() == id)
                .findFirst().orElseThrow(()-> new EmployeePayrollException("Exception Not Found"));
    }

    @Override
    public EmployeePayrolData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrolData employeePayrolData=new EmployeePayrolData(employeePayrolDataList.size()+1,employeePayrolDTO);
        employeePayrolDataList.add(employeePayrolData);
        return employeePayrolData;
    }

    public EmployeePayrolData updateEmployeePayrollData(int id, EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrolData employeePayrolData=this.getEmployeePayrollDataById(id);
        employeePayrolData.setFName(employeePayrolDTO.getFName());
        employeePayrolData.setSalary(employeePayrolDTO.getSalary());
        employeePayrolData.setGender(employeePayrolDTO.getGender());
        employeePayrolData.setStartDate(employeePayrolDTO.getStartDate());
        employeePayrolData.setNote(employeePayrolDTO.getNote());
        employeePayrolData.setProfilePic(employeePayrolDTO.getProfilePic());
        employeePayrolData.setDepartment(employeePayrolDTO.getDepartment());
        employeePayrolDataList.set(id-1,employeePayrolData);
        return employeePayrolData;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        employeePayrolDataList.remove(id-1);
    }
}
