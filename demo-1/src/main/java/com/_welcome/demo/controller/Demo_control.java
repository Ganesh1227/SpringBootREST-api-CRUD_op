package com._welcome.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com._welcome.demo.entity.Demo_Entity;
import com._welcome.demo.services.Demo_services;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class Demo_control {
	
	@Autowired
	Demo_services demo_services;
	
	@PostMapping("/sending")
	public Demo_Entity create(@RequestBody Demo_Entity St )
	{
		return demo_services.create(St);
	}
	@GetMapping("/reading")
	public List<Demo_Entity> getMethodName() {
		return demo_services.Read();
	}
	@DeleteMapping("/deletting/{id}")
	 public String delete(@PathVariable int id  )
	 {
		return demo_services.delete(id);
	 }
	
	@PutMapping("updating/{id}")
	public Demo_Entity putMethodName(@PathVariable int id, @RequestBody  Demo_Entity St) {
		//TODO: process PUT request
		
		return demo_services.update(id,St);
	}
	
	
	

}
