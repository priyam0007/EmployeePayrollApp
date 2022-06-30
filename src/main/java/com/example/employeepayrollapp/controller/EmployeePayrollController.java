package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.dto.ResponseDTO;
import com.example.employeepayrollapp.model.EmployeePayrolData;
import com.example.employeepayrollapp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {
    @Autowired
    private IEmployeeService iEmployeeService;

    /*
    get all date by get
     */
    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        List<EmployeePayrolData> empData=iEmployeeService.getEmployeePayrollData();
        ResponseDTO responseDTO=new ResponseDTO("Get Call Successfull",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    /*
     get data by id
     */

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int id){
        EmployeePayrolData employeePayrolData=iEmployeeService.getEmployeePayrollDataById(id);
        ResponseDTO responseDTO=new ResponseDTO("Get call for ID Success",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    /*
    get data by department
     */
    @GetMapping("/department/{department}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable String department){
        List<EmployeePayrolData> employeePayrolData=iEmployeeService.getEmployeesByDepartment(department);
        ResponseDTO responseDTO=new ResponseDTO("Get call for employee dapartment Success",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    /*
    create data by postmapping
     */
    @PostMapping(value = "/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody EmployeePayrolDTO employeePayrolDTO){
        EmployeePayrolData employeePayrolData=iEmployeeService.createEmployeePayrollData(employeePayrolDTO);
        ResponseDTO responseDTO=new ResponseDTO("created employee payroll succesfully",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    /*
     update data by putmapping
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int id,@Valid @RequestBody EmployeePayrolDTO employeePayrolDTO){
        EmployeePayrolData employeePayrolData=iEmployeeService.updateEmployeePayrollData(id,employeePayrolDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated employee payroll data succesfully",employeePayrolData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    /*
     delete data by deletemapping
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable int id){
        iEmployeeService.deleteEmployeePayrollData(id);
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}

