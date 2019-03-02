package com.test.bill;

import java.util.ArrayList;
import java.util.List;

public class BillCalculator {
	
	
	public static void main(String[] args) {
		
		List<Item> itemList = new ArrayList<Item>();
		
		Item item = new Item();
		item.setItemName("Dettol");
		item.setItemId("1264ED");
		item.setCategory("Medical");
		item.setPrice(10);
		
		
		Item item1 = new Item();
		item1.setItemName("Oil");
		item1.setItemId("1263ED");
		item1.setCategory("Non Medical");
		item1.setPrice(5);
		
		Item item2 = new Item();
		item2.setItemName("Banana");
		item2.setItemId("12632ED");
		item2.setCategory("None");
		item2.setPrice(5);
		
		itemList.add(item);	
		itemList.add(item1);
		itemList.add(item2);
		
		Double amount =AppUtil.generateBill(itemList);
		
		System.out.println("\n*******ABC General Store **************\n");
		System.out.println("Item      Category     Price ");
		System.out.println("-----------------------------------------------");
		for(Item list : itemList) {
			System.out.println(list.getItemName()+ "       "+list.getCategory()+"         "+list.getPrice());
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Bill Amount : "+amount);
		
	}
	

}
