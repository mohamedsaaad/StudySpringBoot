package com.example.demo.StudySpringBootQuickStart.Lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
	
	@Autowired
	private LessonService lessonService;

	
	@RequestMapping("/Topic/{topicId}/Course/{courseId}/Lesson")
	public List<Lesson> getAllLesson(@PathVariable String courseId){
		return lessonService.getAllLessons(courseId);
	}
	
	@RequestMapping("/Topic/{topicId}/Course/{courseId}/Lesson/{lessonId}")
	public Lesson getLessonById(@PathVariable String lessonId) {
		return lessonService.getLessonById(lessonId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Topic/{topicId}/Course/{courseId}/Lesson")
	public void addLesson(@RequestBody Lesson lesson,@PathVariable String courseId) {
		lessonService.addLesson(lesson,courseId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/Topic/{topicId}/Course/{courseId}/Lesson/{lessonId}")
	public void updateLesson(@RequestBody Lesson lesson,@PathVariable String courseId) {
		lessonService.updateLesson(lesson,courseId);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Topic/{topicId}/Course/{courseId}/Lesson/{lessonId}" )
	public void deleteLesson(@PathVariable String lessonId) {
		lessonService.deleteLesson(lessonId);
	}
	
	
}
