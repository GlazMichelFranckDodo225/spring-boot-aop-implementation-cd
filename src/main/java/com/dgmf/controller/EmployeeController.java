package com.dgmf.controller;

import com.dgmf.entity.Employee;
import com.dgmf.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<?> fetchAllEmployees() {
        return new ResponseEntity<>(
                employeeService.fetchAllEmployees(),
                HttpStatus.OK
        );
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(
                employeeService.addEmployee(employee),
                HttpStatus.OK
        );
    }
}
