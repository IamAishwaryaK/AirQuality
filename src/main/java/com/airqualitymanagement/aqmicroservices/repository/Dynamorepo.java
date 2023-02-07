package com.airqualitymanagement.aqmicroservices.repository;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import com.airqualitymanagement.aqmicroservices.entity.airQuality;
@Service
public class Dynamorepo extends airQuality{
	private final static Logger LOGGER = LoggerFactory.getLogger(Dynamorepo.class);
	private static List<String> airList;// each element refers to the details of each pensioner as consolidated
	// String
    private static List<airQuality > mapToairQual;
    
//    private static Logger logger =
//    LoggerFactory.getLogger(this.getClass());
    
static {
	try {
		
			airList = Files.lines(Paths.get("results.csv")).collect(Collectors.toList());
			//log.info("Pensioner List : {}", pensionerList);
			mapToairQual = new ArrayList<>();
			for (String line : airList) 
			{
				String[] value = line.split(",");
				airQuality pensionerDetail = new airQuality(Integer.parseInt(value[5]),Integer.parseInt(value[6]), Integer.parseInt(value[3]),Integer.parseInt(value[7]),Integer.parseInt(value[4]),Integer.parseInt(value[2]),Integer.parseInt(value[1]),value[0]);
				mapToairQual.add(pensionerDetail);
				//System.out.print(pensionerDetail);
			}
			//log.debug("Pensioner Detail List : {}", mapAadharToPensionerDetail);
			


		} catch (IOException | ResponseStatusException e) {
			//mapAadharToPensionerDetail.clear();
		}
//	
	}

    public List<airQuality> findall() 
	{
			return mapToairQual;
		//return null;// Pensioner not found
	}
    public List<airQuality> findByFloor(int floor)
	{
   Iterator<airQuality> itr=mapToairQual.iterator();//getting the Iterator
    List<airQuality> list=new ArrayList<>();
	  while(itr.hasNext()) {
		  //check if iterator has the elements  
	  airQuality a=itr.next();
	  if(a.getFloor()==floor)
	  {
		  list.add(a);
	  }
	  }
	return list;
	}

}
