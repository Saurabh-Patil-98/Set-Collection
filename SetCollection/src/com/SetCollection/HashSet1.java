package com.SetCollection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(200);
		hs.add(100.5f);
		hs.add("patil");
		hs.add(true);
		hs.add(null);
		hs.add('a');
		System.out.println(hs);
	}
}
