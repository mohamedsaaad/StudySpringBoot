package com.example.demo.StudySpringBootQuickStart.Topic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	//el annotation el t7t de 3shan a2ol lelSpring en da object mel classes el service el Singleton el enta creatha fel awel.
	@Autowired
	private TopicService topicService;
	
	//request mapping de get method by default.
	@RequestMapping("/Topic")
	public List<Topic> getAllTopic(){
		return topicService.getAllTopics();
		
	}
	
	//{} de bst5tdma hya wel annotation bta3 el path Variable 3shan a3rf el method el bt handle el http request da
	//en hyege hena varible m3 el link fel 3'alb bykon id l7aga h3mlha get, post or update.
	@RequestMapping("/Topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	
	//ze m2olt fo2 en el Request mapping de by default get bs ana adr a5leha post best5dam method wa7dedha post
	//wb3den b7dd el route el bhndlo.
	//wbema en el objec da hykon fel request body fana lazem a2olo en el topic da bymap 3ala topic gayle mel post request.
	@RequestMapping(method = RequestMethod.POST,value =("/Topic"))
	public void addTopic(@RequestBody Topic topic) {
		topicService.add(topic);
	}
	
	
	//using put http method 
	@RequestMapping(method =RequestMethod.PUT,value="/Topic/{id}")
	public void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
		topicService.updateToipc(id,topic);
	}
	
	//using delete http method
	@RequestMapping(method=RequestMethod.DELETE,value="/Topic/{id}")
	public void delete (@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
