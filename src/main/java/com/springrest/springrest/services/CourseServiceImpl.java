package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service; 
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	 public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java", "Beginners level"));
		list.add(new Course(146,"cpp", "Intermediate level"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
			list.forEach(i->{
			if(i.getId()==course.getId()) {
				i.setTitle(course.getTitle());
				i.setDescription(course.getDescription());
			}
			});
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		 list = this.list.stream()
		            .filter(i -> i.getId() != parseLong)
		            .collect(Collectors.toList());
		    
	}
	
	}

	


	
	


