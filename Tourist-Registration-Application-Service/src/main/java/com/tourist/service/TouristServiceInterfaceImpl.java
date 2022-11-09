package com.tourist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;

@Service
public class TouristServiceInterfaceImpl implements TouristServiceInterface{

	
	@Autowired
	private TouristRepository touristRepository;
	
	@Override
	public String createTourist(Tourist tourist) {
		touristRepository.save(tourist);
		return "Tourist information registered successfully!";
	}

	@Override
	public List<Tourist> findAllTourists() {
		List<Tourist> tourists = touristRepository.findByOrderByFirstNameDesc();
		System.out.println("Details in the DB are:" + tourists);
		return tourists;
		
	}

}
