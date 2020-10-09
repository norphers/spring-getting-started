package com.ITAcademy.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ITAcademy.demo.models.Greeting;


@RestController
public class HelloWorldController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greetings?name=User")
	public Greeting greetings(@RequestParam(required=false, defaultValue="World") String name) {
		System.out.println("==== in greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


	
	//------------variable per PATH------------------------------------------------------------
	
	@RequestMapping("/{registerName}")
	public String helloWorld(@PathVariable(value="registerName") String name) {	
		return "Hello, " + name + "!";
	}
	
	//-----------------------------------------------------------------------------------------
		
}