package com.demo.templatingdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.demo.templatingdemo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Service service;

	@GetMapping(value = "/email")
	public String sendEmail() {
		return service.sendEmail();
	}
}
