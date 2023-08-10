package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Course addCourse(@RequestBody Course course) {
		return this.cs.addCourse(course);
	}
	
	
	//put the course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course ) {
		return this.cs.updateCourse(course);
	}
	
	
	
	// Delete the course
	@DeleteMapping("courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.cs.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);	
		}	
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	


	   

	    @PostMapping("/courses")
	    public Course createCourse(@RequestBody Course course) {
	    	return this.cs.saveCourse(course);
	        
	    }
	

	
	
}
