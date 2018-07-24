package com.activeweb.product.beans;

import java.math.BigDecimal;

public class Product {

	private String name;
	private BigDecimal apr;
	private String tandcs;

	public String getTandcs() {
		return tandcs;
	}

	public void setTandcs(String tandcs) {
		this.tandcs = tandcs;
	}

	private Details details;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getApr() {
		return apr;
	}

	public void setApr(BigDecimal apr) {
		this.apr = apr;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

}
