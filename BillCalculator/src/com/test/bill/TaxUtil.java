package com.test.bill;

import java.util.HashMap;
import java.util.Map;

public class TaxUtil {

	private static String MEDICAL = "Medical";
	private static String NON_MEDICAL = "Non Medical";

	private static Map<String, Double> map = null;

	static {
		loadTaxMap();
	}

	public static Map<String, Double> loadTaxMap() {
		map = new HashMap<String, Double>();
		map.put(MEDICAL, 10.5);
		map.put(NON_MEDICAL, 5.0);
		return map;
	}
	
	
}
