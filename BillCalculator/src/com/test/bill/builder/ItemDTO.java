package com.test.bill.builder;

public class ItemDTO {
	
	private String itemId;
	
	private Item item;
	
	private Category category;
	
	private Double totalAmount;
	
	public String getItemId() {
		return itemId;
	}

	public Item getItem() {
		return item;
	}

	public Category getCategory() {
		return category;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	private ItemDTO(Builder builder) {
		this.item = builder.item;
		this.category = builder.category;
		this.itemId = builder.itemId;
		this.totalAmount =builder.totalAmount;
	}
	
	public static class Builder{
		
		private String itemId;
		
		private Item item;
		
		private Category category;
		
		private Double totalAmount;
		
		public Builder item(Item item) {
				this.item = item;
			return this;
		}
		public Builder category(Category category) {
			this.category = category;
			return this;
		}
		
		public Builder itemId(String itemId) {
			this.itemId = itemId;
			return this;
		}
		
		public Builder totalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
			return this;
		}
		
		public ItemDTO build() {
			return new ItemDTO(this);
		}
		
	}
	
	

}
