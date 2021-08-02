package com.hexagonal.architecture.service;

import com.hexagonal.architecture.domain.Employee;
import com.hexagonal.architecture.port.EmployeeRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepositoryPort employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.getAll();
    }

    public void create(String name, String role, long salary){
        employeeRepository.create(name, role, salary);
    }

    public Employee view(Integer userId){
        return employeeRepository.getEmployee(userId);
    }

}