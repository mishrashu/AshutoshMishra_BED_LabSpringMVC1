package com.employeemanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.dao.EmployeeRepository;
import com.employeemanagement.entity.Employee;
import com.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee findById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public void update(Employee originalEmployeeDetails) {
		employeeRepository.save(originalEmployeeDetails);
	}

	@Override
	public void delete(Employee employee) {
		employeeRepository.delete(employee);
	}

}
