package TreeSet.collection;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		//ts.add(null); NullPointerException 
		//ts.add("saurabh");
		ts.add(200);
		System.out.println(ts);
	}
}
