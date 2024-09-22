package com.springRest.springRest.services;

import java.util.List;

import com.springRest.springRest.entity.Courses;

public interface CourseService {
	
public List<Courses> getCourses();

public Courses getCourse(long courseId);



}
