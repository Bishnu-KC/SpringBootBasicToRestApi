package io.javabrains.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {
	
	@RequestMapping("/info")
	public String getInfo()
	{
		return "I am a Java Developer.";
	}

}
