package com.SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHS {

	public static void main(String[] args) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		lhs.add('s');
		lhs.add('h');
		lhs.add('c');
		lhs.add('a');
		System.out.println(lhs);
		Iterator<Character> i = lhs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
