package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args); //1. Sets up default configuration , 3. Performs class path scan
														//2. Starts Spring Application Context , 4. Starts Tomcat server
		

	}

}
