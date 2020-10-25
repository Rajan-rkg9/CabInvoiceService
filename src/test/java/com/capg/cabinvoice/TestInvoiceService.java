package com.capg.cabinvoice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestInvoiceService {
	InvoiceGenerator invoiceGenerator = null;
	
	@Before
	public void setUp() throws Exception
	{
		invoiceGenerator = new InvoiceGenerator();	
	}
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance,time);
		assertEquals(25,fare , 0.0);
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare()
	{
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance,time);
		assertEquals(5,fare , 0.0);
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnMinFare()
	{
		Ride[] rides = {
				new Ride(2.0, 5),
				new Ride(0.1,1)
		};
		
		double fare = invoiceGenerator.calculateFare(rides);
		assertEquals(30,fare , 0.0);
	}
	
}
