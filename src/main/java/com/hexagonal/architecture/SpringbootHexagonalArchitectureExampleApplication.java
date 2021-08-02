package com.hexagonal.architecture;

import com.hexagonal.architecture.adapter.EmployeeServiceAdapter;
import com.hexagonal.architecture.port.EmployeeRepositoryPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootHexagonalArchitectureExampleApplication {

	private final Logger logger = LoggerFactory.getLogger(SpringbootHexagonalArchitectureExampleApplication.class);

	@Bean
	CommandLineRunner init(EmployeeRepositoryPort employeeRepositoryPort){

		return args -> {
			employeeRepositoryPort.create("Raouf", "Admin", 1200);
			employeeRepositoryPort.create("Ramzi", "Developer", 800);
			employeeRepositoryPort.create("Redouane", "DevOps", 900);

			employeeRepositoryPort.getAll().forEach(emp -> logger.info(emp.toString()));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHexagonalArchitectureExampleApplication.class, args);
	}

}
