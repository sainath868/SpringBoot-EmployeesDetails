package com.nt.service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeMgntServiceImpl implements IEmployeeMgntService{
    @Autowired
    private IEmployeeRepository empRepo;
    @Override
    public Iterable<Employee> getAllEmployess() {
        return empRepo.findAll();
    }
}
