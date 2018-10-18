package io.javabrains.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/action")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	
	@RequestMapping("/action/{author}")
	public Topic getTopic(@PathVariable String author)
	{
		return topicService.getTopic(author);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/action")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}

}
