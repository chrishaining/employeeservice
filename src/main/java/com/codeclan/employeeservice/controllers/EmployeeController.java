package com.codeclan.employeeservice.controllers;

import com.codeclan.employeeservice.models.Employee;
import com.codeclan.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id) {
        return employeeRepository.findById(id);
    }
}

