package com.springrest.springrest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
public void createTable() 
{
	var query ="CREATE TABLE course(courseId SERIAL PRIMARY KEY, title VARCHAR(255), description VARCHAR(255))";
	int update = this.jdbcTemplate.update(query);
	System.out.println(update);
}


}
