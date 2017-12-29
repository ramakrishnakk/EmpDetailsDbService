package com.rama.EmpDetailsDbService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rama.EmpDetailsDbService.bean.Employee;
import com.rama.EmpDetailsDbService.service.EmployeeDetailsService;

@RestController
public class EmployeeDetailsController {

	private EmployeeDetailsService empDetailsService;

	@Autowired
	public EmployeeDetailsController(EmployeeDetailsService empDetailsService) {
		this.empDetailsService = empDetailsService;
	}

	@RequestMapping("/")
	public String saveEmployee(@RequestParam(value = "name", required=false, defaultValue="none")
    String empName) {
		Employee employee = empDetailsService.saveEmployee(new Employee(empName));
		return employee==null ? "No data from databse":employee.toString();
	}
	
	@RequestMapping("/getEmployees")
    public @ResponseBody Iterable<Employee> getEmployeeDetails() {
        return empDetailsService.getEmployeeDetails();
    }

	
}
