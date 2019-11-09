package com.dbs.equity.portfolio.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApplicationResource {
	
	@GetMapping("/test/{name}")
	public ResponseEntity<String> testApplication(@PathVariable String name){
		return new ResponseEntity<>(name, HttpStatus.OK);
	}

}
