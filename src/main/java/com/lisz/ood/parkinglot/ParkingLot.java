package com.lisz.ood.parkinglot;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingLot {
	private static final int MAX_CAPACITY = 10;

	private AtomicInteger availbleLotCount = new AtomicInteger(MAX_CAPACITY);

	private  ReceiptGenerator generator = new ReceiptGenerator();

	private Map<Vehicle, Long> startTimeMap = new HashMap<>();

	public ParkingLot() {

	}

	public void register(Vehicle v) {
		if (availbleLotCount.get() == 0) {
			throw new IllegalStateException("No parking lot available!");
		}
		startTimeMap.put(v, System.currentTimeMillis());
		availbleLotCount.decrementAndGet();
	}

	public Receipt unRegister(Vehicle vehicle) {
		availbleLotCount.incrementAndGet();
		return generator.generateReceipt(vehicle, startTimeMap.get(vehicle));
	}
}
