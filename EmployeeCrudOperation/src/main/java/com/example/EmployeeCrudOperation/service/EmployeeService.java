package com.example.EmployeeCrudOperation.service;

import com.example.EmployeeCrudOperation.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


        public Employee createEmployee(Employee employee);

        public List<Employee> getAllEmployees() ;

        public Employee getEmployeeById(Long id) ;

        public Employee updateEmployee(Employee employeeDetails);

        public void deleteEmployee(Long id);
    }


