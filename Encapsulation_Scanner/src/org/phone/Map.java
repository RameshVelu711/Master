package org.phone;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		
		java.util.Map<String , String> m = new LinkedHashMap<String , String>();
		
		m.put("ram", "riyo");
		m.put("va", "mame");
		
		Set<Entry<String,String>> entrySet = m.entrySet();
		for (Entry<String, String> entry : entrySet) {
			
		System.out.println(entry);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
