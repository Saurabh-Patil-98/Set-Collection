package com.SetCollection;

import java.util.HashSet;
import java.util.Iterator;

import org.omg.PortableInterceptor.Interceptor;

public class HashSetIterator {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(300);
		hs.add(500);
		hs.add(200);
		hs.add(400);
		System.out.println(hs);
		Iterator<Integer> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());			
		}
	}
}
