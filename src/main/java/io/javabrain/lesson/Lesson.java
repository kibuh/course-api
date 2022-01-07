package io.javabrain.lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrain.course.Course;
import io.javabrain.topic.Topic;



@Entity
public class Lesson {

	@Id
	private String id;
	private String name;
	private String  description;
	
	@ManyToOne
	private Course course;
	
	
	
	
	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Lesson(String id,  String name,String description, String courseId) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.course = new Course(courseId,"","","");
	}
	
	
	public Lesson() {
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	
}
