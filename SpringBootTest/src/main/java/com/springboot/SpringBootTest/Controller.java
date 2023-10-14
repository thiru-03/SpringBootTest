package com.springboot.SpringBootTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
@GetMapping("/get")
public String hello() {
	return "welcome to all";
}
	
	

}
