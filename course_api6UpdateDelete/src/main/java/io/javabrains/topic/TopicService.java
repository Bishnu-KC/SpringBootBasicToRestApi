package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=(List<Topic>) new ArrayList<>(Arrays.asList(
			new Topic(1,"spring framework","bishnu"),
			new Topic(2,"Core Java","unhsib"),
			new Topic(3,"javascript","bishnuJung")
			
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String author)
	{
		return topics.stream().filter(t->t.getAuthor().equals(author)).findFirst().get();
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	public void updateTopic(String author, Topic topic)
	{
		for(int i=0; i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getAuthor().equals(author))
			{
				topics.set(i, topic);
				return;
			}
					
		}
	}

	public void deleteTopic(String author) {
		topics.removeIf(t->t.getAuthor().equals(author));
	}

}

