package com.mangesh.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(12);
		ls.add(125);
		ls.add(52);
		ls.add(65);
		
		Iterator<Integer> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
