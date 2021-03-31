package com.github1;

import java.util.List;

public interface EmployeeDAO {
 public void saveEmployee(Employee emp);
 public void updateEmployee(int empid,int empsalary);
 public void deleteEmployee(int empid);
 public List<Employee> listEmployees();
 
}
