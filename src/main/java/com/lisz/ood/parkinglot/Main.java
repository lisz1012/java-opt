package com.lisz.ood.parkinglot;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
	private static final Random RANDOM = new Random();

	public static void main(String[] args) throws Exception{
		ParkingLot parkingLot = new ParkingLot();
		for (int i = 0; i < 500; i++) {
			new Thread(()->{
				Vehicle vehicle = new Car(parkingLot);
				vehicle.park();

				try {
					TimeUnit.SECONDS.sleep(1 + RANDOM.nextInt(10));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				vehicle.leave();
			}).start();

			new Thread(()->{
				Vehicle vehicle = new Truck(parkingLot);
				vehicle.park();

				try {
					TimeUnit.SECONDS.sleep(1 + RANDOM.nextInt(10));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				vehicle.leave();
			}).start();

			TimeUnit.SECONDS.sleep(1);
		}

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
