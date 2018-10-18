package io.javabrains.sprinboootstrater.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return Arrays.asList(
				new Topic("spring","spring framework","Spring Framework Descriptio"),
				new Topic("java","Core Java","Java Description"),
				new Topic("Java Script","javascript","javascript description")
				
				);
	}

}
