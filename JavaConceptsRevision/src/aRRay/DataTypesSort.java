package aRRay;

import java.util.Arrays;
import java.util.Comparator;

public class DataTypesSort {
	public static void main(String[] args) {
		System.out.println("***Sorting for Primitive Data Type***");
		int[] num = { 5, 3, 2, 1, 4 };    // Declare an Array and the Data Type as Integer 
		for (int i : num)                 // Using For Each Method to assign num as i 
			System.out.print( " "+i );    // To check if sorting is Happened
		System.out.println("--->Before Sorting Numbers");
		Arrays.sort(num);                // It is one of the Predefined Method in Array
		for (int i : num)               // Using for each to check if sorting is Happened
			System.out.print(" "+i );
		System.out.println("--->After Sorting Numbers");
		System.out.println("**Sorting for Non Primitive Data Type**");
		String[] names = { "Arul", "Viyan", "Niraimathi", "Kavini" };
		System.out.println("----Before Sorting Names------");
		for (String s : names)
			System.out.println(s);
		Arrays.sort(names);
		// an object behaving as another class object
		// Parents -Child extends Parent (ch-is an object of child class its behaving as an object of Parents)
		// Inheritance(Child object behave as Parents Object)
		System.out.println("-----After Sorting Names------");
		for (String s : names)
			System.out.println(s);
		// To Identify the Length of the given Strings
		// Use Comparator Interface To Compare the 2 Strings
		// Create New Class as Comparator Demo
		// After that We will use Dynamic Binding Concept
		Comparator comp = new ComparatorDemo();
		Arrays.sort(names, comp);
// Compare Values Return as Integer
//names[0].length > names[1].length-->Positive Integer
//names[0].length < names[1].length-->Negative Integer
//names[0].length == names[1].length-->Zero
		System.out.println();
		System.out.println("***After Using Comparator Method***");
		for (String s : names)
			System.out.println(s);
	}
}