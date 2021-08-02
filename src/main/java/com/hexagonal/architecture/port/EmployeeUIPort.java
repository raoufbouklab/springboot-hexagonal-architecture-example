package com.hexagonal.architecture.port;


import com.hexagonal.architecture.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeUIPort {

    @PostMapping("create")
    void create(@RequestBody Employee request);

    @GetMapping("view/{id}")
    Employee view(@PathVariable Integer userId);

    @GetMapping("view/")
    List<Employee> viewAll();
}