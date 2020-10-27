package com.capg.cabinvoice;

public class Ride {
	
	public int time;
	public double distance;
	public CabRidesEnum cabRideEnum;;
	
	public Ride(CabRidesEnum cabRideEnum , double distance , int time) {
		this.time = time;
		this.distance = distance;
		this.cabRideEnum = cabRideEnum;
	}
}
