package com.telusko.RESTApi1.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class GreetingRestController2 
{
	@GetMapping("/greet")
	public ResponseEntity<String> generateGreetings()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		int hour=dateTime.getHour();
		String response=null;
		if(hour<12)
	
			response= "Hello! Have a great morning";
		
		else if(hour<16)
			response= "Hello!  Have a great Noon";
		
		else if(hour<20)
			response="Hello!  Have a great Evening";
		else
			response= "Hello!  Have a great night";
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	//@Controller + @ResponseBody ===> @RestController
}
