package aRRay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class FunctionsinArray {
	static int anArray[] = new int[] {};

	public static void main(String[] args) {
//		IndexElements();
//		RandomNumbers();
//		Appendnew();
//		Comparison();
//		Insert();
//		EmptyArray();
//	    Suffle();
//		BoxUnBox();
//		RemoveDuplicate();
		PrintanArray();
//		RemoveFirstElement();
//		Filter();
//		MapToArray();
	}
	
	public static void IndexElements() {
		anArray[0]=1;
		anArray[1]=2;
		anArray[2]=3;
		anArray[3]=4;
		anArray[4]=5;
		System.out.println("Display the Array:"+anArray);
		int size = anArray.length;
		System.out.println("Size of the Array:" + size);
		System.out.println("First Element of an Array:" + anArray[0]);
		System.out.println("Last Element of an Array:" + anArray[size - 1]);
	}
	
	
	public static void RandomNumbers() {
		
		Random rd = new Random();
		int RandomArray;
		int item = 0;
		for (int item1 = 0; item1 < anArray.length; item1++);
			{
			RandomArray = rd.nextInt(anArray.length);
			System.out.println("Random Values: " + RandomArray);
		}
	}

	public static void Comparison() {
		
		int anotherArray[] = { 1, 2, 3, 4, 5 };
		boolean flag = Arrays.equals(anArray, anotherArray);
		System.out.println("Both Arrays are Equal:" + flag);
	}
	
	public static void PrintanArray() {
		int anArray[]=new int [5];
		anArray[0] =1;
		anArray[1] =2;
		anArray[2] =3;
		anArray[3] =4;
		anArray[4] =5;
		for(int item = 0;item<=anArray.length-1;item++) {
			System.out.println(anArray[item]);
		}
				
	}
	
	public static void RemoveDuplicate() {
		int[] anArray = new int[] {5, 4, 4, 3, 2, 2, 1};
		System.out.print("Before Remove Duplicates:");
		Arrays.sort(anArray); 
 		for (int i = 0; i < anArray.length; i++) {
			System.out.print(anArray[i] + "\t");
			}
		System.out.print("\nAfter removing duplicates:");
		int b = 0;
		anArray[b] = anArray[0];
		for (int i = 0; i < anArray.length; i++) {
			if (anArray[b] != anArray[i]) {
				b++;
				anArray[b] = anArray[i];
			}
		}
		for (int i = 0; i <= b; i++) {
			System.out.print(anArray[i] + "\t");
		}
	}
	public static void Appendnew() {
		int anArray[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Before Append:"+Arrays.toString(anArray));
		anArray=Arrays.copyOf(anArray, anArray.length+1);
		anArray[anArray.length-1]=0;
		System.out.println("After Append:"+Arrays.toString(anArray));
			}
	public static void EmptyArray() {
	        int newarray[] = {};
	        if(newarray.length == 0) {
	            System.out.println("The array is empty.");
	        } else {
	            System.out.println("The array is not empty.");
	        }
	    }
	public static void Insert() {
		int anArray[] = new int[] { 1, 2, 3, 4, 5 };
		int n = anArray.length;
		int index = 3;
		System.out.println("Original Array: " + Arrays.toString(anArray));
		Integer newArray[] = new Integer[n + 1];
		int j = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (i == index) {
				newArray[i] = 7;
			} else {
				newArray[i] = anArray[j];
				j++;
			}
		}
		System.out.println("Array after adding value: " + Arrays.toString(newArray));
	}
	
	public static void Suffle() {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> intList = Arrays.asList(intArray);
		Collections.shuffle(intList);
		intList.toArray(intArray);
		System.out.println(Arrays.toString(intArray));
		}
	public static void RemoveFirstElement(){
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
	public static void MapToArray(){
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(101, "Kumar");
		hashMap.put(102, "Yuva");
		hashMap.put(103, "Ravi");
		hashMap.put(104, "Babu");
		FunctionsinArray  Array = new  FunctionsinArray();
		String[] convertMaptoArray =  Array.convertMaptoArray(hashMap);
		for(String values : convertMaptoArray) {
			System.out.println(values);
		}
	}
	private String[] convertMaptoArray(HashMap<Integer, String> sourceMap) {
	Collection<String> values =sourceMap.values() ;
	String[] targetArray = values.toArray(new String [values.size()]);
	return targetArray;
	}
	public static void BoxUnBox() {

		ArrayList<Integer> data = new ArrayList<Integer>();

		// Autoboxing used here to create Integer objects
		data.add(1);
		data.add(3);
		data.add(17);
		data.add(29);
		int sum = 0;
		for (Integer val : data)
			sum += val; // Unboxing used here to extract the ints
		System.out.print("sum = " + sum);
		System.out.println();
	}
	
	}

	
		