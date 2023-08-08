package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController { 
	@Autowired
	private CourseService cs;
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	// get the courses
	@GetMapping("/courses")
    public List<Course> getCourses()
	{	  
		 return this.cs.getCourses();
	}
	
	//get course by ID
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) 
	{
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	
	//post the course
	@PostMapping("/courses")
	public Course addCourse(Course course) {
		return this.cs.addCourse(course);
	}
	
	
}
