package com.lisz.ood.parkinglot;

public abstract class Vehicle {
	protected ParkingLot parkingLot;

	public Vehicle(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	protected void park() {
		parkingLot.register(this);
	};

	abstract void leave();

	abstract int getPricePerHour();
}
