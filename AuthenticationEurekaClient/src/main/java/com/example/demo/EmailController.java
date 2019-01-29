package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/verifyemail")
public class EmailController {
	
List<String> validEmails = Arrays.asList("vallamsettyrevanth@gmail.com","phanindra123.lekkala@gmail.com","phanindrajava1@gmail.com");

@RequestMapping(method = RequestMethod.POST)
public ResponseEntity<String> validateEmail(@RequestParam(value="email") String email) {
	
	if (validEmails.contains(email)) {
		return ResponseEntity.ok().body("User is valid");
	}
	else {
		return ResponseEntity.ok().body("User is not valid");

	}
}





}
