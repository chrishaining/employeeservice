package com.codeclan.employeeservice;

import com.codeclan.employeeservice.models.Employee;
import com.codeclan.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee julie = new Employee("Julie Smith", 43, "NX123", "juliesmith@email.com");
		employeeRepository.save(julie);
	}
}
