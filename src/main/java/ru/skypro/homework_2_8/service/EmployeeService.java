package ru.skypro.homework_2_8.service;

import ru.skypro.homework_2_8.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName,String lastName);
    Employee find(String firstName,String lastName);
    Collection<Employee> findAll();
}
