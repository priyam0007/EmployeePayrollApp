package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.model.EmployeePayrolData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeePayrollController {
    @RequestMapping("/get")
    public ResponseEntity<String> getEmployeePayrollData(){
        return  new ResponseEntity<String>("Get call Success", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable int id){
        return  new ResponseEntity<String>("Get call Success for id"+id, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrolData employeepayrolData){
        return  new ResponseEntity<String>("created employee pay roll data for"+employeepayrolData, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrolData employeePayrolData){
        return  new ResponseEntity<String>("updated Employee payroll data for"+employeePayrolData, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable int id){
        return  new ResponseEntity<String>("delete call Success for id"+id, HttpStatus.OK);
    }

}

