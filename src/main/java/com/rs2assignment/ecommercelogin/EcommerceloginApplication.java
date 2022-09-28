package com.rs2assignment.ecommercelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import repository.UserRepository;

@SpringBootApplication(scanBasePackages = { "controller",
											"service",
											"config",
											"util",
											"filter",
											"entity",
											"repository",
											"com.rs2assignment.ecommercelogin" })
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class EcommerceloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceloginApplication.class, args);
	}

}
