package com;


public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equals("Car");
	}
	
	public String retriveByDriverId(Driver[] drivers, int driverId) {
		for (Driver d : drivers) {
			if(d != null && d.getDriverId() == driverId) {
				return d.toString();
				
			}
		}
		return "Driver not found.";
	}
	
	public int retriveCountOfDriver(Driver[] drivers, String category) {
		int count = 0;
		for (Driver d : drivers) {
			if(d != null && d.getCategory().equals(category)) {
				count++;
				
			}
			
		}
		return count;
	}
	
	public Driver[] retriveDriver(Driver[]drivers, String category) {
		int count = retriveCountOfDriver(drivers, category);
		Driver[] result = new Driver[count];
		int index = 0;
		for(Driver d : drivers) {
			if(d != null && d.getCategory().equals(category)) {
				result[index++] = d;
			}
		}
		return result;
	}
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		if(drivers.length == 0) 
			return null;
		Driver maxDriver = drivers[0];
		for (Driver d : drivers) {
			if (d != null && d.getTotalDistance() > maxDriver.getTotalDistance()){
				maxDriver = d;
			}
		}
		return maxDriver;
	}
}


