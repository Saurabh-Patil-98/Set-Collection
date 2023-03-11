package TreeSet.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TailHeadMethod {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(15);
		ts.add(20);
		ts.add(25);
		ts.add(35);
		ts.add(44);
		System.out.println(ts);
		// head() method
		SortedSet s1 = ts.headSet(20);
		System.out.println(s1);
		// tail() method
		SortedSet s2 = ts.tailSet(20);
		System.out.println(s2);
	}
}
