package com.springrest.springrest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springrest.springrest.dao.CourseDao;

@SpringBootApplication
public class SpringrestApplication implements CommandLineRunner {

	@Autowired
	private CourseDao courseDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.courseDao.createTable(); 
		
	}
	
	

}
