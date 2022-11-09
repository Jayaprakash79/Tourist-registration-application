package com.tourist.service;

import java.util.List;

import com.tourist.entity.Tourist;

public interface TouristServiceInterface {
	public String createTourist(Tourist tourist);
	public List<Tourist> findAllTourists();

}
