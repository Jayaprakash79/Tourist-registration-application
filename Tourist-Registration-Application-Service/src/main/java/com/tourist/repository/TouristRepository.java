package com.tourist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourist.entity.Tourist;

public interface TouristRepository extends JpaRepository<Tourist,Integer>{



	List<Tourist> findByOrderByFirstNameDesc();


}
