package com.airqualitymanagement.aqmicroservices.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.airqualitymanagement.aqmicroservices.airQualityController;
import com.airqualitymanagement.aqmicroservices.entity.airQuality;
import com.airqualitymanagement.aqmicroservices.entity.airQualityService;
@SpringBootTest
//@ExtendWith(MockitoExtension.class)

public class airQualController {
	
	@BeforeEach
	void beforeEach() {
	MockitoAnnotations.openMocks(this);
	}

	@InjectMocks
    airQualityController aqc;
	
	@Mock	
	airQualityService aqs;
	airQuality aq;
	//Test the findbyfloor method of controller 
	
	@Test
	public void getFloor(){
	aq = new airQuality(1,20,10,3,2,1,69,"2023-02-06T09:24:19.068Z");
		
		
	
	
		Mockito.when(aqs.findByFloor(3)).thenReturn(aq);
    	assertNotNull(aqs.findByFloor(3));
		assertEquals(aqs.findByFloor(3), aq);
	
	}
	

	}


