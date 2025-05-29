package com;

public class TestDriver {
	public static void main(String[] args) {
		
		
		Driver[] drivers = new Driver[5];
		
		//Using parameterized constructors
		drivers[0] =new Driver(501, "Ramireddy", "Car", 6000);
		drivers[1] =new Driver(502, "Virat", "Lorry", 3000);
		drivers[2] =new Driver(503, "Mohan", "Auto", 2500);
		drivers[3] =new Driver(504, "Govardhan", "Car", 1500);
		
		
		//Using no-argument constructor and setters
		drivers[4] =new Driver();
		drivers[4].setDriverId(505);
		drivers[4].setDriverName("Vijay");
		drivers[4].setCategory("Lorry");
		drivers[4].setTotalDistance(8000);
		
		
		Travel travel = new Travel();
		
		System.out.println("Is Car Driver:" + travel.isCarDriver(drivers[0]));
		
		System.out.println(travel.retriveByDriverId(drivers, 501));
		System.out.println("Number of Car Drivers:" + travel.retriveCountOfDriver(drivers, "Car"));
		
		Driver[] carDrivers = travel.retriveDriver(drivers, "Car");
		
		System.out.println("Car Drivers:");
		
		for (Driver d : carDrivers) {
			System.out.println(d.toString());
		}
		
		Driver maxDriver = travel.retriveMaximumDistanceTravelledDriver(drivers);
		
		System.out.println("Driver with max distance:" + maxDriver.toString());
		
	}

}
