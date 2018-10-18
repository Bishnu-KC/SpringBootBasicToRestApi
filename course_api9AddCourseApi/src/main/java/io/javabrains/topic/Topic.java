package io.javabrains.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
		@Id	
		private String author;
		private int id;
		private String name;
		
		
		public Topic()
		{
			
		}
		
		public Topic(int id, String name, String author) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
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
