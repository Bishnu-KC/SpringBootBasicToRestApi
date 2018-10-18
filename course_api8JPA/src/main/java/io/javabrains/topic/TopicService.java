package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	
	public List<Topic> getAllTopics()
	{
		//return topics;
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String author)
	{
		//return topics.stream().filter(t->t.getAuthor().equals(author)).findFirst().get();
		return topicRepository.findById(author);
	}
	
	public void addTopic(Topic topic)
	{
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(String author, Topic topic)
	{
		topicRepository.save(topic);
	}

	public void deleteTopic(String author) {
		//topics.removeIf(t->t.getAuthor().equals(author));
		topicRepository.deleteById(author);
	}

}

