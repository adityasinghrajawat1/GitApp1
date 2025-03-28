package com.ms.controller;

import com.ms.model.Employee;
import com.ms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController
{
        @Autowired
        private EmployeeService employeeService;

        @PostMapping
        public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
        {
               Employee emp =  employeeService.addEmployeeService(employee);
                return ResponseEntity.ok(emp);
        }

        @GetMapping
        public ResponseEntity<List<Employee>> getAllEmployee()
        {
            List<Employee> employees = employeeService.getAllEmployeeService();
            return ResponseEntity.ok(employees);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Employee> getEmployeeById(@PathVariable int id)
        {
            Employee emp = employeeService.getEmployeeByIdService(id);
            return ResponseEntity.ok(emp);
        }
}
