package com.mangesh.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(25);
		lhs.add(214);
		lhs.add(-56);
		lhs.add(null);
		
		for(Integer i :lhs) {
			System.out.println(i);
		}
	}

}
