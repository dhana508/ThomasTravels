package com;

public class Driver {
	private int driverId;
	private String driverName;
	private String category;
	private long totalDistance;
	
	//No-argument constructor
	public Driver() {
		this.driverId = 0;
		this.driverName = "Unknown";
		this.category = "Unknown";
		this.totalDistance = 0;
	}
	// Parameterized constructor
	public Driver(int driverId, String driverName, String category, long totalDistance) {
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
		
		
	}
	//Getters
	public int getDriverId() {
		return driverId;
		
	}
	public String getDriverName() {
		return driverName;
	}
	public String getCategory() {
		return category;
	}
	public long getTotalDistance() {
		return totalDistance;
	}
	
	//Setters 
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
		 
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setTotalDistance(long totalDistance) {
		this.totalDistance = totalDistance;
	}
	
	@Override
	public String toString() {
		return "Driver name is " + driverName + " belonging to the category " + category + " traveled " + totalDistance + "KM so far.";
	}
	
	
}
	


