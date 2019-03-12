package com.test.bill.builder;

public class Category {

	private String categoryType;

	private Category(Builder builder) {
		this.categoryType = builder.categoryType;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public static class Builder {
		private String categoryType;

		public Builder categoryType(String categoryType) {
			this.categoryType = categoryType;
			return this;
		}

		public Category build() {
			return new Category(this);
		}
	}

}
