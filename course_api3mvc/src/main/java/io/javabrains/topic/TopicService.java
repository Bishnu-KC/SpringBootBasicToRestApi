package io.javabrains.topic;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.*;


@Service
public class TopicService {
	private List<Topic> topics=(List<Topic>) Arrays.asList(
			new Topic("spring","spring framework","Spring Framework Descriptio"),
			new Topic("java","Core Java","Java Description"),
			new Topic("Java Script","javascript","javascript description")
			
			);
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	

}
