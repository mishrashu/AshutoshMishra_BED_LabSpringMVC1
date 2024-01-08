package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	void save(Employee employee);

	Employee findById(int id);

	void update(Employee originalEmployeeDetails);

	void delete(Employee employee);

}
