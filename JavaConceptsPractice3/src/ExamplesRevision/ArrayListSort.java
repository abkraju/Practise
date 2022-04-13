package ExamplesRevision;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> book= new ArrayList<String>();
book.add("Tamil");
book.add("English");
book.add("Science");
book.add("Maths");
book.add("Social Science");
System.out.println(book);
System.out.println("--------After Sorting--------");
Collections.sort(book);
System.out.println(book);

	}

}
