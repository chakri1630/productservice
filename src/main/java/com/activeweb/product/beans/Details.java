package com.activeweb.product.beans;

import java.util.Map;

public class Details {

	private String tenure;
	private String paymentSchedule;
	private Map<String, String> feeMap;

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public String getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(String paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public Map<String, String> getFeeMap() {
		return feeMap;
	}

	public void setFeeMap(Map<String, String> feeMap) {
		this.feeMap = feeMap;
	}

}
