package com.capg.cabinvoice;

public class InvoiceSummary {
	private int numberOfRides;
	private double totalFare;
	private double averageFare;
	
	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numberOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.numberOfRides;
	}
	
	public double getTotalFare() {
		return totalFare;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return numberOfRides == that.numberOfRides &&
								Double.compare(that.totalFare, totalFare) == 0 &&
								Double.compare(that.averageFare, averageFare) == 0;
	}
}
