package ExamplesRevision;
import java.util.ArrayList;
import java.util.Arrays;

public class Sortarray {

				public static void main(String[] args) {
										
					    //Normal arrays in which we need to specify the size for array 
					    int[] myArray = new int[5];
					    myArray[0] = 1;
					    myArray[1] = 2;
					    myArray[2] = 3;
					    myArray[3] = 4;
					    myArray[4] = 5;
					    System.out.println("Accessing arrays:");
					    System.out.println(Arrays.toString(myArray));
					    /* We cannot add more elements to array myArray as it is fixed size, otherwise we will get an error.*/
					    //ArrayList we need not to specify size in ArrayList
					    ArrayList < Integer > arrayList = new ArrayList < Integer > ();
					    arrayList.add(1);
					    arrayList.add(2);
					    arrayList.add(3);
					    arrayList.add(4);
					    // We can add more elements to arrayList
					    System.out.println("Accessing ArrayList:");
					    System.out.println(arrayList);
					  }

}
				
						

			

		

