package ru.skypro.homework_2_8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework_2_8.model.Employee;
import ru.skypro.homework_2_8.service.DepartmentService;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
 private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;

}
    @GetMapping("/max-salary")
    public Employee findEmployeeMaxSalary(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMaxSalary(departmentId);
    }
    @GetMapping("/min-salary")
    public Employee findEmployeeMinSalary(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMinSalary(departmentId);
    }
    @GetMapping(value = "/all", params = "departmentId")
    public Collection<Employee> findEmployeesByDepartment (@RequestParam int departmentId) {
        return departmentService.findEmployeeByDepartment(departmentId);
    }
    @GetMapping("/all")
    public Map<Integer, List<Employee>> findEmployeesByDepartment () {
        return departmentService.findEmployeeByDepartment();
    }
}
