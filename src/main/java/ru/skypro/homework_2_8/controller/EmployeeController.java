package ru.skypro.homework_2_8.controller;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework_2_8.model.Employee;
import ru.skypro.homework_2_8.service.EmployeeService;

import java.util.ArrayList;
import java.util.Collection;

@RequestMapping("employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.add(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.add(firstName, lastName);
    }
    @GetMapping("/addAll")
    public Collection<Employee> findAll(){
        return employeeService.findAll();
    }
}
