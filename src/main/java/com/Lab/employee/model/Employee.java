package com.Lab.employee.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class Employee {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 @Column(name = "First_Name")
 private String firstName;
 
 @Column(name = "Last_Name")
 private String lastName;
 
 @Column(name = "Gender")
 private String gender;
 
 @Column(name = "Department")
 private String department;
 
 @Column(name = "DOB")
 private String dob;
 
 @Column(name = "Email")
 private String email;
 
 @Column(name = "Mobile_Number")
 private String mobileNumber;
 
 
 
}





