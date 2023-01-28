package com.service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ServiceController {
		
	
	@GetMapping("/data")
	public ResponseEntity<?> getData(){
		
		
		int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
		if(rand%2==0) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.ok().build();
	}
	
	
}
