package com.hexagonal.architecture.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "role", nullable = false)
    private String role;
 
    @Column(name = "salary", nullable = false)
    private long salary;

    public Employee(String name, String role, long salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
}