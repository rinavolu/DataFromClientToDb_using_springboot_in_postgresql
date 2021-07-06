package com.example.pgsqlspringboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicleformtable")
public class vehicleForm {
	
	@Id
	private String licensePlateNumber;
	private String carMake;
	private String carModel;
	private int noOfSeats;
	private String color;
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "vehicleForm [licensePlateNumber=" + licensePlateNumber + ", carMake=" + carMake + ", carModel="
				+ carModel + ", noOfSeats=" + noOfSeats + ", color=" + color + "]";
	}
	
	

}
