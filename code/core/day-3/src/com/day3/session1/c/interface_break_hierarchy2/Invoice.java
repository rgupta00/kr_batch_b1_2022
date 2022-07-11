package com.day3.session1.c.interface_break_hierarchy2;

import java.util.UUID;

public class Invoice implements Payable {
	private String invoiceId;
	private String consulantName;
	private double rateDay;
	private int noOfDays;

	public Invoice(String consulantName, double rateDay, int noOfDays) {
		invoiceId = UUID.randomUUID().toString();
		this.consulantName = consulantName;
		this.rateDay = rateDay;
		this.noOfDays = noOfDays;
	}

	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", consulantName=" + consulantName + ", rateDay=" + rateDay
				+ ", noOfDays=" + noOfDays + "]";
	}

	@Override
	public double getPay() {
		return noOfDays * rateDay * 0.9;
	}

}
