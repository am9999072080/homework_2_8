package ru.skypro.homework_2_8.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework_2_8.exceptions.EmployeeAlreadyAddedException;
import ru.skypro.homework_2_8.exceptions.EmployeeNotFoundException;
import ru.skypro.homework_2_8.model.Employee;

import java.util.*;

    @Service
    public class EmployeeServiceImpl implements EmployeeService{
        private  static  final  int Employees_MAX_Count=10;
        private final Map<String, Employee> employees;
        public EmployeeServiceImpl() {
            this.employees = new HashMap<>();

            add("Sergey", "Sergeyev");
            add("Ivan", "Ivanov");
            add("Aleksey", "Alekseev");
            add("Fedor", "Fedorov");
            add("Maksim", "Maksimov");
            add("Semen", "Semenov");
            add("Andrey", "Andreev");
            add("Mixail ", "Mixailov");
            add("Efrem", "Efremov");
            add("Egor", "Egorov");

        }

        @Override
        public Employee add(String firstName, String lastName) {
            Employee employee=new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())){
                throw new EmployeeAlreadyAddedException(employee);
            }
//            if(employees.size()==Employees_MAX_Count){
//                throw new EmployeeStorageIsFullException();
//            }
            employees.put(employee.getFullName(), employee);
            return employee;
        }

        @Override
        public Employee remove(String firstName, String lastName) {
            Employee employee=new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())){
                throw new EmployeeNotFoundException(employee);
            }
            return employees.remove(employee.getFullName());
        }

        @Override
        public Employee find(String firstName, String lastName) {
            Employee employee=new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())) {
                throw new EmployeeNotFoundException(employee);
            }
            return employees.get(employee.getFullName());
        }

        @Override
        public Collection<Employee> findAll() {
            return Collections.unmodifiableCollection(employees.values());
        }
    }