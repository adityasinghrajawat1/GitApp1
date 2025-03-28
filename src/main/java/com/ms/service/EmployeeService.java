package com.ms.service;

import com.ms.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService
{
        public Employee addEmployeeService(Employee employee);
        public List<Employee> getAllEmployeeService();
}
