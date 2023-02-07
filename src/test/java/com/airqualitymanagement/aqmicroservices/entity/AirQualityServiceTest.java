package com.airqualitymanagement.aqmicroservices.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.airqualitymanagement.aqmicroservices.exception.FloorNotFoundException;
import com.airqualitymanagement.aqmicroservices.repository.Dynamorepo;
import com.airqualitymanagement.aqmicroservices.repository.airQualityRepository;

@SpringBootTest
class AirQualityServiceTest {
	
	@InjectMocks
	private Dynamorepo aqr;
 
	@Autowired
	airQuality aq;
	@Autowired
	airQualityRepository aqse;

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	airQuality aqs = new airQuality(1,20,10,3,2,1,69,"2023-02-06T09:24:19.068Z");
	List<airQuality> list=new ArrayList<>();
	
	
	//floor number oxygen test
	@Test
	public void contextLoads() {
		
		list.add(aqs);
		assertEquals(69,aqs.getAirqual());
		
	}
//	//floor oxygen test
	@Test
	public void floorOxygen() {
		
	    list.add(aqs);
		assertEquals(20,aqs.getOxygen());
		logger.info("User  "+22+"  DB  "+aqs.getOxygen());
	}
	@Test
	public void floorCarbon() {
		list.add(aqs);
	    airQuality aq=list.get(0);
		assertEquals(1,aq.getCarbon());
	}
//	//check if the floor is present
	@Test
	public void containsFloor()
	{
		boolean aq=aqse.existsById(1);
		assertNotNull(aqse.existsById(1));
		logger.info("User  "+true+"  DB  "+aqse.existsById(3));
	}

}
