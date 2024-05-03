package com.sb.myfirstsbapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.myfirstsbapp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query("From Employee")
	List<Employee> getAllEmployees();
	
	@Query("select e.empName from Employee e")
	List<String> getAllEmployeeNames();
	
	@Query("select e.empName,e.empSal from Employee e")
	List<Object[]> getAllEmployeeNamesSalary();

	

}
