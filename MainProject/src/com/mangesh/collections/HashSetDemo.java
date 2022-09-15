package com.mangesh.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Delhi");
		hs.add("Pune");
		hs.add("Chennai");
		hs.add("Mumbai");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
