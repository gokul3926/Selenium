package org.gokul;

import java.util.HashSet;
import java.util.Set;

public class class3 {

	public static void main(String[] args) {
		
		Set c = new HashSet(); 
		
		c.add(1234);
		c.add("java");
		c.add('M');
		
		int size = c.size();
		System.out.println(size);
		
		c.remove("java");
		System.out.println(c);
		
		c.removeAll(c);
		System.out.println(c);
 }
}
