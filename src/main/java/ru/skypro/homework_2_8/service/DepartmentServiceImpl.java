package ru.skypro.homework_2_8.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework_2_8.exceptions.EmployeeNotFoundException;
import ru.skypro.homework_2_8.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class DepartmentServiceImpl implements DepartmentService{

}
