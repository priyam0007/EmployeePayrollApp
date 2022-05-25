package com.example.employeepayrollapp.dto;



import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrolDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname pattern is wrong")
    public String fName;
    @Min(value = 500, message = "Min salary should be more than 500")
    public int salary;
    public String gender;
    public LocalDate startDate;
    public String note;
    public String profilePic;
    public List<String> department;
}
