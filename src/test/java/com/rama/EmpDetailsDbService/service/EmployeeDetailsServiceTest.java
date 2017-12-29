package com.rama.EmpDetailsDbService.service;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rama.EmpDetailsDbService.bean.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDetailsServiceTest {

	private EmployeeDetailsService subject;
	
	@Mock
	private EmployeeDetailsRepository empDetailsRepo;
	
	@Before
	public void setup(){
		subject = new EmployeeDetailsService(empDetailsRepo);
	}
	
	@Test
	public void itShouldFetchEmployeeDetails(){
		subject.getEmployeeDetails();
		verify(empDetailsRepo).findAll();
	}
	
	@Test
	public void itShouldSaveEmployeeDetails(){
		Employee employee = new Employee("Rama");
		subject.saveEmployee(employee);
		verify(empDetailsRepo).save(employee);
	}
}
