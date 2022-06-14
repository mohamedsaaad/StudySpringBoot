package com.example.demo.StudySpringBootQuickStart.Lesson;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StudySpringBootQuickStart.Course.Course;

@Service
public class LessonService {
	
	@Autowired
	LessonRepository lessonRepository;
	
	
	public List<Lesson> getAllLessons(String courseId){
		List<Lesson> lessons=new ArrayList<>();
		lessonRepository.findByCourseId(courseId).forEach(lessons::add);
		return lessons;
	}

	public Lesson getLessonById(String Id) {
		return lessonRepository.findById(Id).get();
	}
	
	
	public void addLesson(Lesson lesson, String courseId) {
		lesson.setCourse(new Course(courseId,"","",null));
		lessonRepository.save(lesson);
	}
	
	public void updateLesson(Lesson lesson,String courseId) {
		lesson.setCourse(new Course(courseId,"","",null));
		lessonRepository.save(lesson);
	}
	 
	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
	}
}
