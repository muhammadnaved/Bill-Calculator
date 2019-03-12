package com.test.bill;

import java.util.ArrayList;
import java.util.List;

import com.test.bill.builder.Item;
import com.test.bill.builder.ItemDTO;

public class AppUtil {
	
	private static final String CATEGORY_MEDICAL = "Medical";
	private static final String CATEGORY_NON_MEDICAL = "Non_Medical";

	private static double getTaxDetails(ItemDTO item) {
		Double tax = null;
			String type= item.getCategory().getCategoryType();
		if(type != null)	{
			switch (type) {
			case CATEGORY_MEDICAL:
				tax=TaxEnum.Medical.getTax();
				break;
			case CATEGORY_NON_MEDICAL:
				tax= TaxEnum.Non_Medical.getTax();
				break;
			}
		}
		
		if(tax != null) 
			return (item.getItem().getPrice() * tax)/100;
		else
		return 0.0;
	
	}
	
	public static List<Item> generateBill(List<ItemDTO> itemDetails) {
		Double itemAmount = 0.0;
		Item item = null;
		List<Item> items = new ArrayList<Item>();
		for(ItemDTO list : itemDetails) {
			Double taxOnItem = getTaxDetails(list);
			itemAmount = list.getItem().getPrice()+ taxOnItem;
			 item = new Item.Builder()
			.setTaxOnItem(taxOnItem)
			.setPrice(list.getItem().getPrice())
			.setItemName(list.getItem().getItemName())
			.setTotalAmount(itemAmount)
			.build();
			items.add(item);
		}
		return items;
	}

}
