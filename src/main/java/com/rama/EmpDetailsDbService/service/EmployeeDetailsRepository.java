package com.rama.EmpDetailsDbService.service;

import org.springframework.data.repository.CrudRepository;

import com.rama.EmpDetailsDbService.bean.Employee;

public interface EmployeeDetailsRepository extends CrudRepository<Employee, Long>{

}
