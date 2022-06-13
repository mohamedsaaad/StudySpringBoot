package com.example.demo.StudySpringBootQuickStart.Course;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudySpringBootQuickStart.Topic.Topic;

@RestController
public class CourseController {
	
	//el annotation el t7t de 3shan a2ol lelSpring en da object mel classes el service el Singleton el enta creatha fel awel.
	@Autowired
	private CourseService courseService;
	
	//request mapping de get method by default.
	@RequestMapping("/Topic/{topicId}/Course")
	public List<Course> getAllCourses(@PathVariable String topicId){
		return courseService.getAllCourses(topicId);
		
	}
	
	//{} de bst5tdma hya wel annotation bta3 el path Variable 3shan a3rf el method el bt handle el http request da
	//en hyege hena varible m3 el link fel 3'alb bykon id l7aga h3mlha get, post or update.
	@RequestMapping("/Topic/{topicId}/Course/{id}")
	public Course getTopic(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	
	//ze m2olt fo2 en el Request mapping de by default get bs ana adr a5leha post best5dam method wa7dedha post
	//wb3den b7dd el route el bhndlo.
	//wbema en el objec da hykon fel request body fana lazem a2olo en el topic da bymap 3ala topic gayle mel post request.
	@RequestMapping(method = RequestMethod.POST,value =("/Topic/{topicId}/Course"))
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	
	//using put http method 
	@RequestMapping(method =RequestMethod.PUT,value="/Topic/{topicId}/Course/{courseId}")
	public void updateCourse(@PathVariable String topicId,@RequestBody Course course) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	//using delete http method
	@RequestMapping(method=RequestMethod.DELETE,value="/Topic/{TopicID}/Course/{courseId}")
	public void delete (@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
}
