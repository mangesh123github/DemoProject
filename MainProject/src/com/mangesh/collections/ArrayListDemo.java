package com.mangesh.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vivek");
		al.add("Vishal");
		al.add("Mayur");
		al.add("Kunal");
		
		for(String i : al) {
			System.out.println(i);
		}

	}

}
