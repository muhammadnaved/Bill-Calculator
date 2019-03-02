package com.test.bill;

import java.util.List;
import java.util.Map;

public class AppUtil {

	public static double getTaxDetails(Item item) {
		Map<String, Double> map = TaxUtil.loadTaxMap();
		if (item != null && item.getCategory() != null) {
			if (map.containsKey(item.getCategory())) {
				Double taxPercent = map.get(item.getCategory());
					return (item.getPrice() * taxPercent)/100;
			}
				
		}
		return 0;

	}
	
	public static Double generateBill(List<Item> itemDetails) {
		Double totalAmount = 0.0;
		Double itemAmount = 0.0;
		for(Item list : itemDetails) {
			Double taxOnItem = AppUtil.getTaxDetails(list);
			itemAmount = list.getPrice() + taxOnItem;
			totalAmount += itemAmount;
		}
		return totalAmount;
	}

}
