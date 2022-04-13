package Samples;
import java.util.ArrayList;
import java.util.Collections;

public class Sortstring {
	public static void main(String[]args) {
		ArrayList<String> Studentnamelist =new ArrayList<>();
		Studentnamelist.add("Tharun");
		Studentnamelist.add("Dhavaneeth");
		Studentnamelist.add("Rathan");
		Studentnamelist.add("Vishnu");
		Studentnamelist.add("Nithin");
		Studentnamelist.add("Kirthin");
		Studentnamelist.add("Dhanvanth");
		for(String temp : Studentnamelist) {
			System.out.println(temp);
		}
		
		Collections.sort(Studentnamelist);
		    System.out.println("after sort the Studentnamelist..");
		for(String temp : Studentnamelist) {
			System.out.println(temp);
			
		}
		
	}

}
