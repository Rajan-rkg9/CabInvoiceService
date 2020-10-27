package com.capg.cabinvoice;

public class InvoiceGenerator {

	public RideRepository rideRepo;

	public void setRideRepository(RideRepository rideRepo) {
		 this.rideRepo=rideRepo;
	}
	
	public InvoiceSummary getInvoiceSummary(String userId) {
		return this.calculateFare(rideRepo.getRides(userId));
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride : rides)
			totalFare = totalFare + ride.cabRideEnum.calculateRideFare(ride);
		
		return new InvoiceSummary(rides.length, totalFare);
	}
	
	public void addRides(String userId, Ride[] rides) {
		rideRepo.addRide(userId, rides);
	}
}
