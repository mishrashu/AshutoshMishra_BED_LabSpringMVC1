package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public String showEmployeeList(Model model) {

		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		return "employees";
	}

	@GetMapping("/new")
	public String createEmployee(Model model) {

		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	}

	@PostMapping
	public String saveEmployeeRecord(@ModelAttribute("emplyoee") Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";

	}

	@GetMapping("/edit/{id}")
	public String editEmployeeRecord(@PathVariable int id, Model model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		return "edit_employee";
	}

	@PostMapping("/{id}")
	public String updateEmployeeRecord(@PathVariable int id, @ModelAttribute("employee") Employee theEmployee) {
		Employee originalEmployeeDetails = employeeService.findById(id);
		originalEmployeeDetails.setId(theEmployee.getId());
		originalEmployeeDetails.setFirstName(theEmployee.getFirstName());
		originalEmployeeDetails.setLastName(theEmployee.getLastName());
		originalEmployeeDetails.setEmail(theEmployee.getEmail());
		employeeService.update(originalEmployeeDetails);
		return "redirect:/employees";
	}

	@GetMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {
		Employee employee = employeeService.findById(id);
		employeeService.delete(employee);
		return "redirect:/employees";
	}

}
