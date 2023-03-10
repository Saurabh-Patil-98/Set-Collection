package com;

import java.util.ArrayList;

public class CtoA {

	public static void main(String[] args) {
		System.out.println("Collection to array conversion");
		ArrayList<String> a = new ArrayList<String>();
		a.add("s");
		a.add("a");
		a.add("u");
		a.add("r");
		a.add("a");
		a.add("b");
		a.add("h");
		System.out.println(a);
		String[] s = a.toArray(new String[a.size()]);
		for (String s1 : s) {
			System.out.print(s1);
		}
	}
}
