// Adding one collection into another
package com.SetCollection;

import java.util.LinkedHashSet;

public class AddCollection2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(200);
		System.out.println(lhs);
		// Constructor based approach
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>(lhs);
		lhs2.add(50);
		lhs2.add(150);
		System.out.println(lhs2);
		// Using addAll() method
		LinkedHashSet<Integer> lhs3 = new LinkedHashSet<Integer>();
		lhs3.addAll(lhs2);
		lhs3.add(250);
		lhs3.add(300);
		System.out.println(lhs3);
	}
}
