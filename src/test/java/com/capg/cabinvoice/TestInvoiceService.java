package com.capg.cabinvoice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestInvoiceService {
	InvoiceGenerator invoiceGenerator = null;
	RideRepository rideRepo = null;
	Ride[] rides = null;
	InvoiceSummary expectedSummary = null;
	
	@Before
	public void setUp() throws Exception
	{
		invoiceGenerator = new InvoiceGenerator();	
		rideRepo = new RideRepository();
		invoiceGenerator.setRideRepository(rideRepo);
		rides = new Ride[] {
							new Ride(CabRidesEnum.NORMAL, 2.0, 5), 
							new Ride(CabRidesEnum.PREMIUM, 0.1, 1) 
						   };
		expectedSummary = new InvoiceSummary(2, 45.0);

	}
	
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary()
	{
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		assertEquals(expectedSummary,summary );
	}
	
	@Test
	public void givenUserIdAndNumberOfRides_ShouldReturnInvoiceSummary() {
		String userId = "a@b.com";
		invoiceGenerator.addRides(userId, rides);
		InvoiceSummary summary = invoiceGenerator.getInvoiceSummary(userId);
		assertEquals(expectedSummary, summary);
	}
}
