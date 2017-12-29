package com.rama.EmpDetailsDbService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.EmpDetailsDbService.bean.Employee;

@Service
public class EmployeeDetailsService {

	private EmployeeDetailsRepository empDetailsRepo;

	@Autowired
	public EmployeeDetailsService(EmployeeDetailsRepository empDetailsRepo) {
		this.empDetailsRepo = empDetailsRepo;
	}

	public Iterable<Employee> getEmployeeDetails() {
		return empDetailsRepo.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return empDetailsRepo.save(employee);
	}

}
