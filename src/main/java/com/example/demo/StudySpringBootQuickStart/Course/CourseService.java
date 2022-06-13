package com.example.demo.StudySpringBootQuickStart.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//by using above annotation spring make this class as a Singleton's class
//that create one instance from this class and register it in memory and inject this instance
//to all classes that depend on it.
public class CourseService {
	
	
	@Autowired
	CourseRepository courseRepository;
//	
//	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("Spring","Spring framework","Spring framework description"),
//			 new Topic("java","Java Core","Java Core description"),
//			 new Topic("javaScript","JavaScript fundementals","JavaScript description")));

	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);;
		return courses;
	}


	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}


	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}


	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
