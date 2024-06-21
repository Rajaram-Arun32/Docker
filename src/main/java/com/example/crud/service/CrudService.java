package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import com.example.crud.Entity.Employee;

public interface CrudService {

		public Employee saveEmployee(Employee emp);
		public List<Employee> getEmployeeDetails();
		public Optional<Employee> getByEmployeeId(int id); 
		public Employee updatemployee(int id,Employee emp);
//		public Employee employeePatchUpdate(int id,Employee emp);
//		public String deleteEmployee(int id);
//		
}
