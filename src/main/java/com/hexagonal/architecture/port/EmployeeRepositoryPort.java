package com.hexagonal.architecture.port;

import com.hexagonal.architecture.domain.Employee;

import java.util.List;

public interface EmployeeRepositoryPort {

    void create(String name, String role, long salary);

    Employee getEmployee(Integer userId);

    List<Employee> getAll();
}