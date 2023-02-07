package com.airqualitymanagement.aqmicroservices.entity;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airqualitymanagement.aqmicroservices.repository.Dynamorepo;
import com.airqualitymanagement.aqmicroservices.repository.airQualityRepository;

@Service
public class airQualityService {
	@Autowired
	airQualityRepository aqr;
	@Autowired
	Dynamorepo repo;

	
	//method to find the air quality details by floor number
	public airQuality findByFloor(int floor)
	{
		
//		Iterator itr=list.iterator();//getting the Iterator  
//		  while(itr.hasNext()){//check if iterator has the elements  
//		   System.out.println(itr.next());
		
		return (airQuality) (aqr.findById(floor).get());		
	}

   //method to return the air quality details of all floor number
	public List<airQuality> findall() {
		// TODO Auto-generated method stub
		return (List<airQuality>) aqr.findAll();
	}
	
	//Returns if the table contains the particular floor 
	public boolean containsFloor(int floor)
	{
		if(aqr.existsById(floor))
			return true;
		else 
			return false;
		
	}


}
