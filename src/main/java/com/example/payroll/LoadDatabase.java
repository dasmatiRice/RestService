package com.example.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.payroll.Employee.Employee;
import com.example.payroll.Employee.EmployeeRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
  

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
    	log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
    	log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
    };
  }
}