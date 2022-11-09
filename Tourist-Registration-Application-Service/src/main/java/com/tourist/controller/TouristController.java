package com.tourist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.entity.Tourist;
import com.tourist.service.TouristServiceInterfaceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/tourist")
public class TouristController {
	
	@Autowired
	private TouristServiceInterfaceImpl touristServiceInterfaceImpl;
	
	@PostMapping("/register")
	public String createTourist(@RequestBody Tourist tourist) {
		return touristServiceInterfaceImpl.createTourist(tourist);
	}
	@GetMapping("/getAllTourists")
	public List<Tourist> findAllTourists(){
		return touristServiceInterfaceImpl.findAllTourists();
	}

}
