package com.codewrite.rsi.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	@GetMapping
	public String getViewData() {	
		// This will generate a build in Jenkins
		// A new change over the network
		// change 3  
		return "customerrest";		
		
		// This is should be built automatically.
				// another comment... 
				// third comment...
				// 4th comment.....ghjhggh
				
	}
	

}
