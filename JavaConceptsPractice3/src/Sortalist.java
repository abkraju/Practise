import java.util.ArrayList;
import java.util.Collections;

  public class Sortalist {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<Integer> integerList = new ArrayList();
		
		integerList.add(15);
		integerList.add(1);
		integerList.add(13);
		integerList.add(5);
		integerList.add(3);
		integerList.add(10);
		
		for(Integer temp : integerList) {
			System.out.println(temp);
		}
		Collections.sort(integerList);
		
	    System.out.println("after sorting list..");
	    for(Integer temp :integerList) {
	    System.out.println(temp);
	
	   }
   }
}


