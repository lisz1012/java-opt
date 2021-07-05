package com.lisz.ood.parkinglot;

public class Car extends Vehicle {

	private static final int PRICE_PER_HOUR = 2;

	public Car(ParkingLot parkingLot) {
		super(parkingLot);
	}

	@Override
	void leave() {
		Receipt receipt = parkingLot.unRegister(this);
		System.out.println("Car is leaving the parking lot, receipt: \n"
				+ receipt + "\n-----------------\n");
	}

	@Override
	int getPricePerHour() {
		return PRICE_PER_HOUR;
	}
}
