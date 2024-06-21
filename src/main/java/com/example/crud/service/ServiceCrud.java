package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.Entity.Employee;
import com.example.crud.repository.CrudRepository;
@Service
public class ServiceCrud implements CrudService{
	@Autowired
	CrudRepository crudrepository;
	@Override
	public Employee saveEmployee(Employee emp) {
		return crudrepository.save(emp);
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		return crudrepository.findAll();
	}
	@Override
	public Optional<Employee> getByEmployeeId(int id) {
		return crudrepository.findById(id);	
	}

	@Override
	public Employee updatemployee(int id, Employee emp) {
	Optional<Employee> employee= crudrepository.findById(id);
	if(employee.isPresent()) {
		Employee employee1=employee.get();
		employee1.setName(emp.getName());
		employee1.setAddress(emp.getAddress());
		employee1.setAge(emp.getAge());
		employee1.setSalary(emp.getSalary());
		return crudrepository.save(employee1);
	}
	return null;
	}

//	@Override
//	public Employee employeePatchUpdate(int id, Employee emp) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteEmployee(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
}
