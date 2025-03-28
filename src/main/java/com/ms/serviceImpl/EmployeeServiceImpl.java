package com.ms.serviceImpl;

import com.ms.model.Employee;
import com.ms.repository.EmployeeRepository;
import com.ms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployeeService(Employee employee)
    {
            return employeeRepository.save(employee);
    }
}
