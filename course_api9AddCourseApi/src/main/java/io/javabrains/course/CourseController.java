package io.javabrains.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.topic.Topic;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/display/{author}/courses")
	public List<Course> getAllCourses(@PathVariable String author)
	{
		return courseService.getAllCourses(author);
	}
	
	
	@RequestMapping("/display/{topicAuthor}/courses/{author}")
	public Optional<Course> getCourse(@PathVariable String author)
	{
		return courseService.getCourse(author);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/display/{topicAuthor}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId)
	{
		course.setTopic(new Topic());
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/display/{topicAuthor}/courses/{author}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String author)
	{
		course.setTopic(new Topic());
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/display/{topicAuthor}/courses/{author}")
	public void deleteTopic(@PathVariable String author)
	{
		 courseService.deleteCourse(author);
	}

}
