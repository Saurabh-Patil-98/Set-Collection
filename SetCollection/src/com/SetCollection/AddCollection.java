package com.SetCollection;

import java.util.HashSet;

public class AddCollection {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("A");
		h.add("B");
		System.out.println(h);
		// 1st approach using constructor based
		HashSet h1 = new HashSet(h);
		h1.add("P");
		h1.add("S");
		System.out.println(h1);
		// 2nd approach using addAll() method
		HashSet h2 = new HashSet();
		h2.addAll(h);
		h2.add("R");
		h2.add("C");
		System.out.println(h2);
	}

}
