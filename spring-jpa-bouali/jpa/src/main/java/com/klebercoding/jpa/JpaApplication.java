package com.klebercoding.jpa;

import com.klebercoding.jpa.models.Author;
import com.klebercoding.jpa.models.Course;
import com.klebercoding.jpa.repositories.AuthorRepository;
import com.klebercoding.jpa.repositories.CourseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner (AuthorRepository authorRepository){
//		return args -> {
//			var author = Author.builder()
//				.firstName("Kleber")
//				.lastName("Vaiz")
//				.email("kleber@gmail.com")
//				.age(30)
//				.build();
//
//			authorRepository.save(author);
//
//		};
//	}
}
