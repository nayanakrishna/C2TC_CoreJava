//program to demonstrate usage of source command in eclipce
package com.tnsif.lesson3g;
class CarOne{
	private String carName;
	private Integer topSpeed;

	
	
	public CarOne(String carName, Integer topSpeed) {
		super();
		this.carName = carName;
		this.topSpeed = topSpeed;
		System.out.println("Car name "+carName);
		System.out.println("Top Speed "+topSpeed);
	}
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}

}

public class SmartCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarOne c=new CarOne("seltos",100);
		

	}

}
