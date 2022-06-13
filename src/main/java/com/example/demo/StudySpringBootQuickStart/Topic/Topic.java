package com.example.demo.StudySpringBootQuickStart.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String description;
	
	//the default constructor
	public Topic(){}
	
	//Parameterized  constructor
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	
	

}
