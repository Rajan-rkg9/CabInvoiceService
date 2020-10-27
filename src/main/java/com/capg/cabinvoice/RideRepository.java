package com.capg.cabinvoice;

import java.util.*;

public class RideRepository {
	Map<String, ArrayList<Ride>> userMultipleRides = null;

	public RideRepository() {
		this.userMultipleRides = new HashMap<>();
	}

	public void addRide(String userId, Ride[] rides) {
		ArrayList<Ride> rideList = userMultipleRides.get(userId);
		if (rideList == null) 
			userMultipleRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
		else 
			rideList.addAll(Arrays.asList(rides));

	}

	public Ride[] getRides(String userId) {
		return userMultipleRides.get(userId).toArray(new Ride[0]);
	}
}
