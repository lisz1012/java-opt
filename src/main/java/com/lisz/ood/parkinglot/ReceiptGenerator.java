package com.lisz.ood.parkinglot;

public class ReceiptGenerator {

	private PriceCalculator calculator = new PriceCalculator();

	public Receipt generateReceipt(Vehicle vehicle, Long startAt) {
		int price = calculator.calculate(vehicle, startAt);
		return new Receipt(vehicle, startAt,
				           System.currentTimeMillis(), price);
	}
}
