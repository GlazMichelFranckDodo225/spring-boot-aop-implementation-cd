package com.dgmf.service.impl;

import com.dgmf.repository.EmployeeRepository;
import com.dgmf.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
}
