package aRRay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class RemoveFirstElement {
	public static void RemoveFirst(){
	List<String> list = new ArrayList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("C");
	list.add("B");
	list.add("A");
	System.out.println(list);
	String removedStr = list.remove(1);
	System.out.println(list);
	System.out.println(removedStr);
	}
	public static void main(String[] args) {
		RemoveFirst();

	}
}

	
	
	
	
	
	
	
	
	

	
