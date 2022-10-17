package com.example.rest.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {
	
		
		@RequestMapping(value = "/hello",method = RequestMethod.GET)
		@ResponseBody
		public String  sayHello() {
			
			
			return "Hello friends";
			
		}
	
		@RequestMapping(value = "/send",method = RequestMethod.POST)
		@ResponseBody
		public String  postData() {
			
			
			
			return "Data added successfully";
		}
	

}
