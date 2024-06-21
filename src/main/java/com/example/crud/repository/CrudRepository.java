package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.Entity.Employee;
@Repository
public interface CrudRepository extends JpaRepository<Employee, Integer> {

}
