package com.example.kubespring.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/ok")
	public HttpStatus getOk(HttpServletRequest request) {
		logger.info(request.getRequestURI());
		
		return HttpStatus.OK;
	}
	
}
