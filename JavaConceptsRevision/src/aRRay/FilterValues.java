package aRRay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class FilterValues {
	public static void Filter() {
	List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");
    list.add("G");
    list.add("H");
    List<String> filters = new ArrayList<>();
    filters.add("D");
    filters.add("E");
    filters.add("F");
    System.out.println("Original List " + list);
    list.removeAll(filters);
    System.out.println("Filtered List " + list);
 }
	public static void main(String[] args) {
		Filter();
		
	}

}
