package ru.skypro.homework_2_8.service;

import ru.skypro.homework_2_8.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee findEmployeeWithMaxSalary(int departmentId);
    Employee findEmployeeWithMinSalary(int departmentId);
    Collection<Employee> findEmployeeByDepartment(int departmentId);
    Map<Integer, List<Employee>> findEmployeeByDepartment();
}
