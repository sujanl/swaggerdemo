package com.sujandemo.swaggerdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("swagger/demo")
public class PrintHelloWorld {
	
	@GetMapping("/hello")
	public ResponseEntity<Object> hello() {
		return new ResponseEntity<Object>("HelloWorld", HttpStatus.OK);
	}
}
