package com.example.crud;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.crud.Entity.Employee;
import com.example.crud.repository.CrudRepository;
import com.example.crud.service.ServiceCrud;

@SpringBootTest
class SimpleCrudexampleApplicationTests {
	@Autowired
	private ServiceCrud employeeservice;
	@MockBean
	private CrudRepository employeeRepo;
	@Test
	public void saveEmployee() {
		Employee emp=new Employee(1,"Arun","hyderabad",24,8000);
		when(employeeservice.saveEmployee(emp)).thenReturn(emp);
		assertEquals(emp, employeeservice.saveEmployee(emp));
	
	}
	@Test
	public void getEmployeeDetails() {
		when(employeeRepo.findAll()).thenReturn(Stream.of(new Employee(1,"Arun","hyderabad",25,8000.0),
				new Employee(1,"Arun","hyderabad",25,8000.0)).collect(Collectors.toList()));
		assertEquals(2, employeeservice.getEmployeeDetails().size());
		
	}
	
}
