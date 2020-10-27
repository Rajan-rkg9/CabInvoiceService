package com.capg.cabinvoice;

public enum CabRidesEnum {
	NORMAL(10.0,1.0,5.0),PREMIUM(15.0,2.0,20.0);
	public double costPerKm;
	public double costPerMin; 
	public double minFare;
	
	private CabRidesEnum(double costPerKm, double costPerMin, double minFare) {
		this.costPerKm = costPerKm;
		this.costPerMin = costPerMin;
		this.minFare = minFare;
	}
	
	public double calculateRideFare(Ride ride) {
		double totalFare = ride.distance * costPerKm + ride.time * costPerMin;
		return Math.max(totalFare, minFare);
	}
}
