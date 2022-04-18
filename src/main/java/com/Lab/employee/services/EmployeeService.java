package com.Lab.employee.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lab.employee.model.Employee;
import com.Lab.employee.repository.EmployeeRepository;


@Service
public class EmployeeService {

 @Autowired
 private EmployeeRepository repository;
 
 public void save(Employee employee) {
	 
  repository.save(employee);
 }
}
