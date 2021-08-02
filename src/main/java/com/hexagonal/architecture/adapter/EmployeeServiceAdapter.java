package com.hexagonal.architecture.adapter;

import com.hexagonal.architecture.domain.Employee;
import com.hexagonal.architecture.port.EmployeeRepositoryPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class EmployeeServiceAdapter implements EmployeeRepositoryPort {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void create(String name, String role, long salary) {
        var employee = new Employee(name, role, salary);
        entityManager.persist(employee);
    }

    @Override
    public Employee getEmployee(Integer userId) {
        return entityManager.find(Employee.class, userId);
    }

    @Override
    public List<Employee> getAll() {
        return entityManager.createQuery("Select t from " + Employee.class.getName() + " t").getResultList();
    }
}