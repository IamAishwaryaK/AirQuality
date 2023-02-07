package com.airqualitymanagement.aqmicroservices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class airQuality {

//Table to be created for the sensor data	
	@Id
	@Column
	private int floor;
	@Column
	private int oxygen;
	@Column
	private int carbondioxide;
	@Column
	private int sulphurdioxde;
	@Column
	private int carbonmonoxide;
	@Column
	private int carbon;
	@Column
	private int airqual;
	@Column
	private String timestamp;
	
	
	//Constructor
	public airQuality() {}
	
	public airQuality(int floor, int oxygen, int carbondioxide, int sulphurdioxde, int carbonmonoxide, int carbon,
			int airqual,String timestamp) {
		super();
		this.floor = floor;
		this.oxygen = oxygen;
		this.carbondioxide = carbondioxide;
		this.sulphurdioxde = sulphurdioxde;
		this.carbonmonoxide = carbonmonoxide;
		this.carbon = carbon;
		this.airqual = airqual;
		this.timestamp=timestamp;
	}
	
	//Getters and setters
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getOxygen() {
		return oxygen;
	}
	public void setOxygen(int oxygen) {
		this.oxygen = oxygen;
	}
	public int getCarbondioxide() {
		return carbondioxide;
	}
	public void setCarbondioxide(int carbondioxide) {
		this.carbondioxide = carbondioxide;
	}
	public int getSulphurdioxde() {
		return sulphurdioxde;
	}
	public void setSulphurdioxde(int sulphurdioxde) {
		this.sulphurdioxde = sulphurdioxde;
	}
	public int getCarbonmonoxide() {
		return carbonmonoxide;
	}
	public void setCarbonmonoxide(int carbonmonoxide) {
		this.carbonmonoxide = carbonmonoxide;
	}
	public int getCarbon() {
		return carbon;
	}
	public void setCarbon(int carbon) {
		this.carbon = carbon;
	}
	public int getAirqual() {
		return airqual;
	}
	public void setAirqual(int airqual) {
		this.airqual = airqual;
	}
	public String gettimestamp() {
		return timestamp;
	}
	public void settimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
@Override
	public String toString() {
		return "airQuality [floor=" + floor + ", oxygen=" + oxygen + ", carbondioxide=" + carbondioxide
				+ ", sulphurdioxde=" + sulphurdioxde + ", carbonmonoxide=" + carbonmonoxide + ", carbon=" + carbon
				+ ", airqual=" + airqual + "]";
	}

}
