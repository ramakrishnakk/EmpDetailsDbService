package com.rama.EmpDetailsDbService;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rama.EmpDetailsDbService.bean.Employee;
import com.rama.EmpDetailsDbService.service.EmployeeDetailsService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDetailsControllerTest {

	private EmployeeDetailsController subject;
	
	@Mock
	private EmployeeDetailsService empDetailsService;
	
	@Before
	public void setup(){
		subject = new EmployeeDetailsController(empDetailsService);
	}
	
	@Test
	public void itShouldSaveEmployeeDetails(){
		String employee = "Rama"; 
		subject.saveEmployee(employee);
		verify(empDetailsService).saveEmployee(any(Employee.class));
	}
	
	@Test
	public void itShouldGetEmployeeDetails(){
		subject.getEmployeeDetails();
		verify(empDetailsService).getEmployeeDetails();
	}
	
}
