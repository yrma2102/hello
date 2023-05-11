package com.example.helloHuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	 @RequestMapping("/")
	    public String index(@RequestParam(value="name", required=false) String name,@RequestParam(value="lastname", required=false) String lastname) {
		 String response;
		 if(name == null) {
			 response = "Hello Human";
		 }else {
			 response = "Hello :"+name+ " "+ lastname;
		 }
	        return response;
	    }

}
