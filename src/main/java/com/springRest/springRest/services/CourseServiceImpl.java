package com.springRest.springRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.springRest.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	List <Courses> lst;
	

	public CourseServiceImpl() {
		lst = new ArrayList<>();
		lst.add(new Courses(145,"Java","Java1"));
		lst.add(new Courses(145,"Python","Python1"));
	}

    @Override
    public List<Courses> getCourses(){
		return lst;
	}

	@Override
	public Courses getCourse(long courseId) {
		Courses c = null;
		
		for(Courses course:lst) {
			if(course.getId()==courseId) {
				c= course;
				break;
			}
		}
		return c;
	}
    
    

}
