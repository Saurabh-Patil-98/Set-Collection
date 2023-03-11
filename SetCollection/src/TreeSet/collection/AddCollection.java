package TreeSet.collection;

import java.util.TreeSet;

public class AddCollection {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(120);
		ts.add(44);
		System.out.println(ts);
		// constructor based approach
		TreeSet ts2 = new TreeSet(ts);
		ts2.add(135);
		ts2.add(98);
		System.out.println(ts2);
		// addAll() method
		TreeSet ts3 = new TreeSet();
		ts3.addAll(ts2);
		ts3.add(30);
		System.out.println(ts3);
	}

}
