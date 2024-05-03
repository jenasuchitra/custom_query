package com.sb.myfirstsbapp.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.sb.myfirstsbapp.entities.Employee;
import com.sb.myfirstsbapp.repository.EmployeeRepository;

@Component
public class EmployeeRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		/*Employee obj1 = new Employee();
		obj1.setEmpName("Trisa");
		obj1.setEmpSal(45000.00);
		
		Employee obj2 = new Employee();
		obj2.setEmpName("Chitra");
		obj2.setEmpSal(55000.00);
		
		empRepo.save(obj1);
		empRepo.save(obj2);*/
		
		/*List<Employee> employees = empRepo.getAllEmployees();
		System.out.println(employees);*/
		
		/*List<String> employeeNames = empRepo.getAllEmployeeNames() ;
		System.out.println(employeeNames);*/
		
		
		List<Object[]> emp = empRepo.getAllEmployeeNamesSalary();
		emp.stream().forEach(records ->{
			System.out.println(records[0]+"---"+records[1]);//stream is a API
		});

		
	}
	
	
	}
