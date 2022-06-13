package com.example.demo.StudySpringBootQuickStart.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//by using above annotation spring make this class as a Singleton's class
//that create one instance from this class and register it in memory and inject this instance
//to all classes that depend on it.
public class TopicService {
	
	
	@Autowired
	TopicRepository topicRepository;
//	
//	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("Spring","Spring framework","Spring framework description"),
//			 new Topic("java","Java Core","Java Core description"),
//			 new Topic("javaScript","JavaScript fundementals","JavaScript description")));

	
	public void add(Topic topic) {
		topicRepository.save(topic);
	}
	
	public List<Topic> getAllTopics(){
		//return this.topics;
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);;
		return topics;
	}


	public Topic getTopic(String id) {
		//return this.topics.stream().filter(topic -> topic.getID().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();
	}


	public void updateToipc(String id,Topic topic) {
		topicRepository.save(topic);
		
	}


	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
