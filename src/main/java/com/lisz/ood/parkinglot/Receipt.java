package com.lisz.ood.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Receipt {
	private Vehicle vehicle;
	private long startAt;
	private long endAt;
	private int price;
}
