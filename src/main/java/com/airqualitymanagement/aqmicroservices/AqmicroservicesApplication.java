package com.airqualitymanagement.aqmicroservices;




import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.airqualitymanagement.aqmicroservices.entity.airQuality;
import com.airqualitymanagement.aqmicroservices.repository.airQualityRepository;

@SpringBootApplication
public class AqmicroservicesApplication{
	

	@Autowired
	private airQualityRepository aqr;
	private airQuality findbyfloor;
	public static void main(String[] args) {
		SpringApplication.run(AqmicroservicesApplication.class, args);
		BasicConfigurator.configure();
	}
//	public void run(String... args) throws Exception {
//		airQuality aq=aqr.findByFloor(1);
//		logger.info("Airquality",aq);
//	}

}
