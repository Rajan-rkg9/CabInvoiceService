package com.capg.cabinvoice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInvoiceService {
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance,time);
		assertEquals(25,fare , 0.0);
	}
}
