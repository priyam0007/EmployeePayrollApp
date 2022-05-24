package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.dto.ResponseDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/web")
public class EmployeePayrollController {
    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        EmployeePayrolData employeePayrolData=new EmployeePayrolData(1,new EmployeePayrolDTO("Priya","Madiwalar",
                "fundtech","developer",35000));
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int id){
        EmployeePayrolData employeePayrolData=null;
        employeePayrolData =new EmployeePayrolData(2,new EmployeePayrolDTO("Priya","Madiwalar",
                "fundtech","developer",35000));
        ResponseDTO responseDTO=new ResponseDTO("Get call for ID Success",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrolDTO employeePayrolDTO){
        EmployeePayrolData employeePayrolData=new EmployeePayrolData(1,employeePayrolDTO);
        ResponseDTO responseDTO=new ResponseDTO("created employee payroll succesfully",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrolDTO employeePayrolDTO){
        EmployeePayrolData employeePayrolData=new EmployeePayrolData(1,employeePayrolDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated employee payroll data succesfully",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable int id){
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}