package org.ar;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Dup {
	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("Ram");
		li.add("Ram");
		li.add("Ramesh");
		li.add("Anil");
		li.add("Choudary");
		li.add("Ram");
		for(int i=0;i<li.size();i++) {
			
			String string = li.get(i);
			System.out.println();
		}

		Set<String> set = new LinkedHashSet<>();
		set.addAll(li);
		System.out.println(set);

	}

}
