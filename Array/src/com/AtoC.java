package com;

import java.util.ArrayList;

import java.util.Arrays;
//import java.util.Iterator;

public class AtoC {

	public static void main(String[] args) {
		System.out.println("Array to Collection conversion");
		String[] a = {"S","a","u","r","a","b","h"};
		ArrayList<String>  a1 = new ArrayList<String>(Arrays.asList(a));
		System.out.println(a1);	
		
		for (String s : a1) {
			System.out.print(s);
		}
	}
}
