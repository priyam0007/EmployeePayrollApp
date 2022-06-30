package com.example.employeepayrollapp.exceptions;

import com.example.employeepayrollapp.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class EmployeePayrollExceptionalHandler {
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ResponseDTO> httpHandleException(HttpMessageNotReadableException exception){
        log.error("Invalid date format",exception);
        ResponseDTO responseDTO=new ResponseDTO("Exception while Processing REST Request", "should not date in the format dd-MM-yyyy");
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleExceptions(MethodArgumentNotValidException methodArgumentNotValidException){
        List<ObjectError> errorList=methodArgumentNotValidException.getBindingResult().getAllErrors();
        List<String> errorMessage=errorList.stream().map(objectError -> objectError.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO=new ResponseDTO("Exception while Processing REST Request",errorMessage);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(EmployeePayrollException.class)
    public ResponseEntity<ResponseDTO> handleCustomException(EmployeePayrollException employeePayrollException){
        ResponseDTO responseDTO=new ResponseDTO("Exception while Processing REST Request", employeePayrollException.getMessage());
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResponseDTO> handleConstraintException(ConstraintViolationException constraintViolationException){
        ResponseDTO responseDTO=new ResponseDTO("Exception while Processing REST Request", constraintViolationException.getMessage());
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}

