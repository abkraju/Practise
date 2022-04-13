package aRRay;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	// Use Comparator Interface To Compare the 2 Strings
	// Create New Class as Comparator Demo
	@Override
	public int compare(Object o1, Object o2) {
	String s1 = (String)o1;
	String s2 = o2.toString();
	// The above two lines converted Object Class to String Class Object
	if (s1.length() > s2.length())
		return +1;
	else if (s1.length() < s2.length())
	return -1;
	else		
		return 0;
//Each the Sort method call the comp to Compare the Names and then "+1" Ascending/"-1" Descending/ "0"-Same Order
	
}
}