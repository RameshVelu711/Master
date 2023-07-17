package org.phone;

import java.util.ArrayList;

public class List {
	// user defined list
	
	public static void main(String[] args) {
	
		java.util.List<Pojo> li = new ArrayList<Pojo>();

		Pojo p  = new Pojo();
		
		p.setId(100);
		p.setName("Ramesh");
		p.setPhNo(5345366346363l);
		
		Pojo p1 = new Pojo();
		p1.setId(200);
		p1.setName("Mani");
		p1.setPhNo(456445745745745l);
		
	
		
		li.add(p);
		li.add(p1);
		
//		System.out.println("ForLoop");
		
//		for (int i = 0; i < li.size() ; i++) {
//			
//			System.out.println(li.get(i).getId());
//			
//			System.out.println(li.get(i).getName());
//			
//			System.out.println(li.get(i).getPhNo());}
//		}
			
		System.out.println("ForEach");
	
		for (Pojo x : li) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhNo());
			
		}
	
}
	
}

