package com.lisz.ood.parkinglot;

public class Truck extends Vehicle {

	private static final int PRICE_PER_HOUR = 3;

	public Truck(ParkingLot parkingLot) {
		super(parkingLot);
	}

	@Override
	void leave() {
		Receipt receipt = parkingLot.unRegister(this);
		System.out.println("Truck is leaving the parking lot, receipt: \n"
				+ receipt + "\n-----------------\n");
	}

	@Override
	int getPricePerHour() {
		return PRICE_PER_HOUR;
	}
}
