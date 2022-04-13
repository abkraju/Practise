package Samples;
import java.util.ArrayList;
import java.util.Collections;

  public class Sortarraylist {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<Integer> alist = new ArrayList<>();
		
		alist.add(15);
		alist.add(1);
		alist.add(9);
		alist.add(12);
		alist.add(4);
		alist.add(13);
		alist.add(5);
		alist.add(6);
		alist.add(10);
		System.out.println("default order: "+alist);
	    Collections.sort(alist); //Ascending order
	    System.out.println("Ascending order: "+alist);
	    Collections.sort(alist,Collections.reverseOrder()); //Descending order
	    System.out.println("Descending order: "+alist);
	
	   }
   }
