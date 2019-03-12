package com.test.bill;

import java.util.ArrayList;
import java.util.List;

import com.test.bill.builder.Category;
import com.test.bill.builder.Item;
import com.test.bill.builder.ItemDTO;

public class BillCalculator {
	
	
	public static void main(String[] args) {
		
		List<ItemDTO> itemList = new ArrayList<ItemDTO>();
		
		ItemDTO itemDTO = new ItemDTO.Builder()
								.category(new Category.Builder()
										.categoryType("Medical")
										.build())
								.item(new Item.Builder()
										.setItemName("Dettol")
										.setPrice(10)
										.build())
								.build();
		
		 
		ItemDTO itemDTO1 = new ItemDTO.Builder()
								.category(new Category.Builder()
										.categoryType("Non_Medical")
										.build())
								.item(new Item.Builder()
										.setItemName("Oil")
										.setPrice(5)
										.build())
								.build();
		
		ItemDTO itemDTO2 = new ItemDTO.Builder()
				.category(new Category.Builder()
						.categoryType("None")
						.build())
				.item(new Item.Builder()
						.setItemName("Banana")
						.setPrice(5)
						.build())
				.build();
		
		itemList.add(itemDTO);
		itemList.add(itemDTO1);
		itemList.add(itemDTO2);
		
		
		
		
		
		List<Item> items =AppUtil.generateBill(itemList);
		
		System.out.println("\n*******ABC General Store **************\n");
		System.out.println("Item      Category     Price                Tax On Item");
		System.out.println("-----------------------------------------------");
		Double totalAmount = 0.0;
		if(items != null && !items.isEmpty()) {
			for(Item list : items) {
				totalAmount = totalAmount + list.getTotalAmount();
				System.out.println(list.getItemName()+ "                "+list.getPrice()+"                  "+list.getTaxOnTime());
			}
		}
	
		
		System.out.println("-----------------------------------------------");
		System.out.println("Bill Amount : "+totalAmount);
		
	}
	

}
