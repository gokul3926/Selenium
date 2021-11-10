package org.gokul;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		
		Map<String,Integer> mi = new TreeMap();
		
		mi.put("csk", 14);
		mi.put("mi", 02);
		mi.put("RCB", 23);
		mi.put("kkr", 46);
		
		System.out.println(mi);
		
		int size = mi.size();
		System.out.println(size);
		
		boolean containsKey = mi.containsKey("RCB");
		System.out.println(containsKey);
		
		boolean containsValue = mi.containsValue(46);
		System.out.println(containsValue);
		
		Integer integer = mi.get("RCB");
		System.out.println(integer);
		
	
		
		
		
		

	}

}
