package com.ms.serviceImpl;

import com.ms.model.Employee;
import com.ms.repository.EmployeeRepository;
import com.ms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployeeService()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByIdService(int id)
    {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        if(optionalEmployee.isPresent())
        {
            return optionalEmployee.get();
        }
        else throw new RuntimeException("Employee with id : "+id+" not found");
    }
}
