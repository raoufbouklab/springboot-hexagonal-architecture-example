package com.hexagonal.architecture.adapter;

import com.hexagonal.architecture.domain.Employee;
import com.hexagonal.architecture.port.EmployeeUIPort;
import com.hexagonal.architecture.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees/")
public class EmployeeControllerAdapter implements EmployeeUIPort {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public List<Employee> viewAll() {
        return employeeService.getAll();
    }

    @Override
    public void create(@RequestBody Employee request) {
        employeeService.create(request.getName(), request.getRole(), request.getSalary());
    }

    @Override
    public Employee view(@PathVariable Integer id) {
        return employeeService.view(id);
    }
}