package com.jason.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControoler {

	@RequestMapping(value="/")
	public String Home(){
		return "Hello world";
	}
}
