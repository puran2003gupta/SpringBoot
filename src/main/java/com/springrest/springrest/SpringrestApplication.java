package com.springrest.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@SpringBootApplication
public class SpringrestApplication implements CommandLineRunner {
	@Autowired
	private CourseDao studentDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.studentDao.createTable();
		
	}
	
	

}
