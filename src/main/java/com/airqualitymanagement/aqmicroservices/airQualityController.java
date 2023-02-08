package com.airqualitymanagement.aqmicroservices;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.SimpleLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airqualitymanagement.aqmicroservices.entity.airQuality;
import com.airqualitymanagement.aqmicroservices.entity.airQualityService;
import com.airqualitymanagement.aqmicroservices.exception.FloorNotFoundException;
import com.airqualitymanagement.aqmicroservices.repository.Dynamorepo;



@RestController
public class airQualityController {
 
	private Logger logger = LoggerFactory.getLogger(this.getClass());
 
 
	@Autowired
	airQualityService aqr;
	@Autowired
	Dynamorepo repo;
	
	 
	//Get air quality details of each floor
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/floor/{flnum}")
	public List<airQuality> findfloor(@PathVariable int flnum)
	{
		if(!aqr.containsFloor(flnum))throw new FloorNotFoundException();
		
		logger.info(""+repo.findByFloor(flnum));
		return repo.findByFloor(flnum);
		
	}
	//Get air quality details of all floors
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/floor/all")
	public List<airQuality> findAll()
	{
		logger.info(""+repo.findall());
		return repo.findall();
	}

}
