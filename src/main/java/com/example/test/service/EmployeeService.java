package com.example.test.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.test.entity.Employee;
import com.example.test.exception.EmployeeAlreadyExistsException;
import com.example.test.repository.EmployeeRepository;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) throws EmployeeAlreadyExistsException {
		Employee excep=employeeRepository.findById(employee.getId()).orElse(null);
		if(excep== null) {
			return employeeRepository.save(employee);
		}else {
			throw new EmployeeAlreadyExistsException("Employee already exists.");
			
		}
		
	}
	
	public List<Employee> saveEmployees(List<Employee>employees){
		return employeeRepository.saveAll(employees);
	}
	
	public List<Employee>getEmployees(){
		//Sort sortorder = Sort.by("salary");
		
		return employeeRepository.findAll(Sort.by("salary").descending().and(Sort.by("name")));
	}
	
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "employee is deleted"+id;
	}
	public Employee updateEmployee(Employee ep) {
		Employee em=employeeRepository.findById(ep.getId()).orElse(null);
		em.setName(ep.getName());
		em.setSalary(ep.getSalary());
		em.setDesignation(ep.getDesignation());
		return employeeRepository.save(em);
		
	}

	public String updateEmployeeBySalary(String salary, Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		return "updated successfully"+salary;
	}	

}
