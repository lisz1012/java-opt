package com.lisz.ood.parkinglot;

public class PriceCalculator {

	public int calculate(Vehicle vehicle, Long startAt) {
		long time = System.currentTimeMillis() - startAt;
		int hours = (int) time / 1000;
		return vehicle.getPricePerHour() * hours;
	}
}
