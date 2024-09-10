package com.project.demo.dao;

import com.project.demo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> findALL();

    Employee findById(int id);

    Employee save(Employee employee);

}
