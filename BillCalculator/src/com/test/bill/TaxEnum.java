package com.test.bill;

public enum TaxEnum {
	
		Medical(10.5), Non_Medical(5);
	
	TaxEnum(double tax){
		this.tax = tax;
	}
	private final double tax;

	public double getTax() {
		return tax;
	}

}
