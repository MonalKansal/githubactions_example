package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.springRest.entity.Courses;
import com.springRest.springRest.services.CourseService;

@RestController
public class MyController {
    
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home()
	{
		return "This is Home Page";
	}
	//Get The courses
	
	@GetMapping("/Courses")
	public List<Courses> getCourses(){
		
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/Courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
			
			return this.courseService.getCourse(Long.parseLong(courseId));
		}
		
	
	
}
