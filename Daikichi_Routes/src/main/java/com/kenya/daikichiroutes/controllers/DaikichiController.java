package com.kenya.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
// Imports 
import org.springframework.web.bind.annotation.RestController;

@RestController // Used to talk to the database

public class DaikichiController {
	
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "Welcome!";
		
	}
	
	@RequestMapping("/daikichi/today")
	public String intro() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
		
	
}
