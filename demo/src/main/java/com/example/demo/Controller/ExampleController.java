package com.example.demo.Controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle-api/v1/vehicles")
public class ExampleController {
	
	@PostMapping("/vehicle")
	  public User createUser(@Valid @RequestBody User user) {
	    return userRepository.save(user);
	  }

}
