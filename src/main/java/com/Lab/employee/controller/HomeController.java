package com.Lab.employee.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Lab.employee.model.Employee;
import com.Lab.employee.services.EmployeeService;



@Controller
public class HomeController {

 @Autowired
 private EmployeeService service;
 
 List<String> departments; 
 
 
 @ModelAttribute
 public void departmentdetails() {
	 departments = new ArrayList<String>();
	 departments.add(" Computer Science Dept.");
	 departments.add(" Electrical Dept. ");
	 departments.add(" Electronics Dept. ");
	 departments.add(" Mechanical Dept. ");
	 departments.add(" Civil Dept. ");
	 
 }
 
 
 @RequestMapping(value = "/" , method = RequestMethod.GET)
 public String home(Model model, Employee employee) {
	 
  model.addAttribute("departments", departments);
  return "register";
  
 }
 
 
 @RequestMapping(value = "/save",method = RequestMethod.POST)
 public String register(@ModelAttribute("employee") Employee employee, Model model) {
	 
  System.out.println("get departments:::"+employee.getDepartment());
  service.save(employee);
  return "welcome";
  
 }
 
 
}
