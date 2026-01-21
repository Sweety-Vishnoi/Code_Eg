package com.example.EmployeeCrudOperation.controller;

import com.example.EmployeeCrudOperation.model.Employee;
import com.example.EmployeeCrudOperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

    /**
     * this is function is used to insert teh record into tables
     * @param employee
     * @return
     */
        @PostMapping
        public Employee createEmployee(@RequestBody Employee employee) {
            System.out.println("insert record");
            return employeeService.createEmployee(employee);
        }

        @GetMapping
        public List<Employee> getAllEmployees() {
            return employeeService.getAllEmployees();
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {
            return employeeService.getEmployeeById(id);
        }

        @PutMapping("/{id}")
        public Employee updateEmployee(@RequestBody Employee employeeDetails) {
            return employeeService.updateEmployee(employeeDetails);
        }

        @DeleteMapping("/{id}")
        public void deleteEmployee(@PathVariable Long id) {
            employeeService.deleteEmployee(id);
        }
    }

