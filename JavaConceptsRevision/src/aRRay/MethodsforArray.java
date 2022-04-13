package aRRay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
public class MethodsforArray {
	public static void main(String[] args) {
		//FandLElements();
		//RandaomValue();
		//ArrayAppend();
		//Insert();
		}
	public static void FandLElements() {
	//Using Simplest Method
	int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
	int firstItem = array[0];
	int lastItem = array[array.length - 1];
	System.out.println("First Element:"+firstItem);
	System.out.println("Last Element:"+lastItem);
	
	//Using with our Concept
	    int anArray[] = new int[] { 1, 2, 3, 4, 5 };
		int size = anArray.length;
		System.out.println("Size of the Array:" + size);
		System.out.println("First Element of an Array:" + anArray[0]);
		System.out.println("Last Element of an Array:" + anArray[size - 1]);
	}
	
	public static void RandaomValue() 
	{
		int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
		int anyValue = array[new Random().nextInt(array.length)];
		System.out.println("Randam Value of an Array:"+(anyValue));
		}
	public static void ArrayAppend() {
		int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
		int[] newArray = Arrays.copyOf(array, array.length + 1);
		int newItem = 0;
		newArray[newArray.length - 1] = newItem;
		int[] newArray1 = ArrayUtils.add(array, newItem);
		System.out.println(newArray1);
		}
	public static void Insert() {
		int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
		int[] largerArray = ArrayUtils.insert(2, array, 77);
		System.out.println(largerArray);
	}
		
	}
