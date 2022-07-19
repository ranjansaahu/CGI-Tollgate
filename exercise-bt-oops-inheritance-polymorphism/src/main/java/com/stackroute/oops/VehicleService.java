package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        return new Car(name, modelName, type);
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name, modelName, type);
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */
    	AbstractManufacturer f = (AbstractManufacturer) first;
    	AbstractManufacturer s = (AbstractManufacturer) second;
    	if(f.getType() == null || s.getType() == null) {
    		return -1;
    	}
    	if(f.getType().equals("sports") && f.getType().equals(s.getType())) {
    		if(first.maxSpeed(f.getType()) == second.maxSpeed(s.getType())) {
    			return 0;
    		}else if(first.maxSpeed(f.getType()) > second.maxSpeed(s.getType())) {
    			return first.maxSpeed(f.getType());
    		}else return second.maxSpeed(s.getType());
    		
    	}
        return -1;
    }
}
