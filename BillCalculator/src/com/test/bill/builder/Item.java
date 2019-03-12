package com.test.bill.builder;

import java.util.Date;

public class Item {

	private String itemName;

	private double price;

	private Date manufactureDate;

	private Date expiryDate;
	
	private Double taxOnTime;
	
	private Double totalAmount;

	private Item(Builder builder) {
		this.itemName = builder.itemName;
		this.price = builder.price;
		this.manufactureDate = builder.manufactureDate;
		this.expiryDate = builder.expiryDate;
		this.taxOnTime = builder.taxOnTime;
		this.totalAmount = builder.totalAmount;

	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}

	public Double getTaxOnTime() {
		return taxOnTime;
	}

	public static class Builder {
		private String itemName;

		private double price;

		private Date manufactureDate;

		private Date expiryDate;
		
		private Double taxOnTime;
		
		private Double totalAmount;

		public Builder setItemName(String itemName) {
			this.itemName = itemName;
			return this;
		}

		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder setManufactorDate(Date manufactureDate) {
			this.manufactureDate = manufactureDate;
			return this;
		}

		public Builder setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
			return this;
		}
		
		public Builder setTaxOnItem(Double taxOnItem) {
			this.taxOnTime = taxOnItem;
			return this;
		}
		
		public Builder setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
			return this;
		}
		
		public Item build() {
			return new Item(this);
		}

	}

}
