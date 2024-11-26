package com.nt.controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class EmployeeOperationController {
@Autowired
private IEmployeeMgntService empService;
    @GetMapping("/")
    public String showHome(){
        return "home";
    }
    @GetMapping("/emp_report")
    public String showEmployeeReport(Map<String,Object>map){
        Iterable<Employee> itEmps=empService.getAllEmployess();
        map.put("empsList",itEmps);
        return "show_employee_report";
    }

}
