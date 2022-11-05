package com.tourist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.model.Tourist;
import com.tourist.service.TouristService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class TouristController {

	@Autowired
	private TouristService ts;
	
	@GetMapping("/tourists")
	public List<Tourist> getAllTourist(){
		return ts.getAllTourist();
	}
	
	@PostMapping("/tourists")
	public Tourist addTourist(@RequestBody Tourist tourist) {
		return ts.addTourist(tourist);
	}
}
