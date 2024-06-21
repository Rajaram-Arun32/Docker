package com.example.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Entity.Employee;
import com.example.crud.service.ServiceCrud;

@RestController
@RequestMapping("/employeedetails")
public class CrudController {
	@Autowired
	private ServiceCrud servicecrud;
	@PostMapping("/saveEmployee")
	public Employee employeeSave(@RequestBody Employee emp){
		return servicecrud.saveEmployee(emp);
	}
	@GetMapping("/GetAllEmployeeDetails")
	public List<Employee> allEmployeeDetails(){
		return servicecrud.getEmployeeDetails();
	}
	@GetMapping("/Employee/{id}")
	public ResponseEntity<Optional<Employee>> employeeGetbyId(@PathVariable int id){
		Optional<Employee> employee= servicecrud.getByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}
}
