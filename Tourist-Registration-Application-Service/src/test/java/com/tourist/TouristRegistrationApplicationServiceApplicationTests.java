package com.tourist;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;
import com.tourist.service.TouristServiceInterfaceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class TouristRegistrationApplicationServiceApplicationTests {
	
	@Autowired
	private TouristServiceInterfaceImpl touristServiceInterfaceImpl;
	
	@MockBean
	private TouristRepository touristRepository;
	@Test
	public void findAllTouristsTest() {
		when(touristRepository.findByOrderByFirstNameDesc()).thenReturn(Stream.of(new Tourist(1,"virat","kohli","male",34,"delhi",7), 
				new Tourist(2,"jp","vad","male",21,"tirupati",7)).collect(Collectors.toList()));
		assertEquals(2,touristServiceInterfaceImpl.findAllTourists().size());
	}
	
	@Test
	public void createTouristTest() {
		Tourist tourist = new Tourist(5,"bukke","shirisha","female",22,"kadapa",7);
		when(touristRepository.save(tourist)).thenReturn(tourist);
		assertEqulas(tourist,touristServiceInterfaceImpl.createTourist(tourist));
		
	}

	private void assertEqulas(Tourist tourist, String createTourist) {
		// TODO Auto-generated method stub
		
	}


}
