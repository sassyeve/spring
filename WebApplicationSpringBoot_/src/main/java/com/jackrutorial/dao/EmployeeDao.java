package com.jackrutorial.dao;

import java.util.List;

import com.jackrutorial.model.*;

public interface EmployeeDao {
 
 public List<Employee> getAllEmployees();
 
 public Employee findeEmployeeById(int id);
 
 public void addEmployee(Employee employee);
 
 public void updateEmployee(Employee employee);
 
 public void deleteEmployee(int id);
}