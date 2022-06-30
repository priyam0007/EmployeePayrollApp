package com.example.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrolDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee firstname pattern is wrong")
    public String name;
    @Min(value = 500, message = "Min salary should be more than 500")
    public int salary;
    @Pattern(regexp = "male|female", message = "Gender needs to be  male or female")
    public String gender;
    //@JsonFormat(pattern = "dd MMM yyyy")
    // @NotNull(message = "startdate should not be empty")
    public String startDate;
    @NotBlank(message = "Note cannot be empty")
    public String note;
    @NotBlank(message = "profilePic cannot be empty")
    public String profilePic;
    @NotNull(message = "department should not be empty")
    public List<String> departments;
}

