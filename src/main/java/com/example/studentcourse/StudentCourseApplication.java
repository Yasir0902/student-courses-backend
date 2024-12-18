package com.example.studentcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseApplication.class, args);
	}

}
