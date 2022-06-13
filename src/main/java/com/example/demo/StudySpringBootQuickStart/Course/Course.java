package com.example.demo.StudySpringBootQuickStart.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.StudySpringBootQuickStart.Topic.Topic;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	

	//the default constructor
	public Course(){}
	
	//Parameterized  constructor
	public Course(String id, String name, String description,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(topicId,"","");
	}
	
	//setters and getters for private Properties.
	public String getID() {
		return id;
	}

	public void setID(String iD) {
		id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	

}
