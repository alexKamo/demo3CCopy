package com.project.demo.rest;

import com.project.demo.entity.Employee;
import com.project.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;


    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable("id") int employeeId){
        Employee emp = employeeService.findById(employeeId);
        if (emp == null) throw new RuntimeException("Employee not found by id: " + employeeId);
        return emp;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.save(employee);
        return emp;
    }

}
