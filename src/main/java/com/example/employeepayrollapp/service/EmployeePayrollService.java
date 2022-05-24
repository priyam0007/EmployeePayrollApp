package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollService implements IEmployeeService {
        @Override
        public List<EmployeePayrolData> getEmployeePayrollData() {
            List<EmployeePayrolData> employeePayrolDataList=new ArrayList<>();
            employeePayrolDataList.add(new EmployeePayrolData(1,new EmployeePayrolDTO("Vinayak","Hasabi",
                    "fundtech","developer",35000)));
            return employeePayrolDataList;
        }

        @Override
        public EmployeePayrolData getEmployeePayrollDataById(int id) {
            EmployeePayrolData employeePayrolData=new EmployeePayrolData(2,new EmployeePayrolDTO("Akshata","Hasabi",
                    "fundtech","developer",35000));
            return employeePayrolData;
        }

        @Override
        public EmployeePayrolData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
            EmployeePayrolData employeePayrolData=new EmployeePayrolData(1,employeePayrolDTO);
            return employeePayrolData;
        }

        @Override
        public EmployeePayrolData updateEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
            EmployeePayrolData employeePayrolData=new EmployeePayrolData(1,employeePayrolDTO);
            return employeePayrolData;
        }

        @Override
        public void deleteEmployeePayrollData(int id) {
        }
}
