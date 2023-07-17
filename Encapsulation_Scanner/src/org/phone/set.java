package org.phone;

import java.util.LinkedHashSet;
import java.util.Set;

public class set {
	
		
		public static void main(String[] args) {
		
		Set<Pojo> s = new LinkedHashSet<>();
		
		Pojo p = new Pojo();
		p.setId(100);
		p.setName("Riyo");
		p.setPhNo(2455545345545l);
		
		Pojo p1 = new Pojo();
		p1.setId(200);
		p1.setName("kumar");
		p1.setPhNo(647645242775l);
		
		
		s.add(p); 
		s.add(p1);
		
		for (Pojo x : s) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhNo());
			
		}
			
			
			
			
			
			
			
		}
		
		
}
