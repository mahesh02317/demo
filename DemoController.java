package com.mahesh.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	static List<String> employees;
	static {
		employees = new ArrayList<>();
		employees.add("Mahesh");
		employees.add("Pravallika");
	}
	@GetMapping("/test")
	public String testResponse() {
		return "Hello! I am listening.";
	}
	
	@GetMapping("/employees")
	public List<String> getEmployees(){
		
		return employees;
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody String name) {
		employees.add(name);
	}

}
