package io.javabrains.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.topic.Topic;

@Entity
public class Course {
	
		@Id	
		private String author;
		private int id;
		private String name;
		
		@ManyToOne
		private Topic topic;
		
		
		public Topic getTopic() {
			return topic;
		}

		public void setTopic(Topic topic) {
			this.topic = topic;
		}

		public Course()
		{
			
		}
		
		public Course(int id, String name, String author, String topicId) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.topic=new Topic();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		
		

}
