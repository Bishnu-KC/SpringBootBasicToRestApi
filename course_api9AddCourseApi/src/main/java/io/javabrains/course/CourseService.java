package io.javabrains.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public List<Course> getAllCourses(String topicId)
	{
		//return topics;
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String author)
	{
		//return topics.stream().filter(t->t.getAuthor().equals(author)).findFirst().get();
		return courseRepository.findById(author);
	}
	
	public void addCourse(Course course)
	{
		//topics.add(topic);
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course)
	{
		courseRepository.save(course);
	}

	public void deleteCourse(String author) {
		//topics.removeIf(t->t.getAuthor().equals(author));
		courseRepository.deleteById(author);
	}

}

