package com.project.demo.service;

import com.project.demo.dao.EmployeeDAO;
import com.project.demo.entity.Employee;
import com.project.demo.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImp(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findALL();
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(1);
    }

    @Transactional
    @Override
    public Employee save(Employee emp) {
        return employeeDAO.save(emp);
    }
}
