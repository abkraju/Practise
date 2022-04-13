package aRRay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;




public class OperationsinArray {
	int[] anArray = new int[] { 1, 2, 3, 4, 5 };
	int[] anotherArray = new int[] { 1, 2, 3, 4, 5 };
	int [] newArray;
	int size;

	public void Indexing() {
		int anArray[] = new int[5];
		anArray[0] = 1;
		anArray[1] = 2;
		anArray[2] = 3;
		anArray[3] = 4;
		anArray[4] = 5;
		for (int item = 0; item <= anArray.length - 1; item++) {
			System.out.println(+anArray[item]);
		}
	}

	public void FLElementArray() {
		size = anArray.length;
		System.out.println("Size of the Array:" + size);
		System.out.println("First Element of an Array:" + anArray[0]);
		System.out.println("Last Element of an Array:" + anArray[4]);
	}

	public void RandomValue() {
		int anyValue = anArray[new Random().nextInt(anArray.length)];
		System.out.println("Random Value:" + anyValue);
	}

	public void comparison() {
		boolean flag = Arrays.equals(anArray, anotherArray);
		System.out.println("Both Arrays are Equal:" + flag);
	}

	public void Appendnew() {
		//Using Simplest Method
		System.out.println("Before Append:"+Arrays.toString(anArray));
		newArray=Arrays.copyOf(anArray, anArray.length+1);
		anArray[anArray.length-1]=0;
		System.out.println("After Append:"+Arrays.toString(anArray));
		
	}
	public void Insert() {
		System.out.println("Orginal Array:" +anArray);
		int[] ExpandArray = ArrayUtils.insert(2, anArray, 77);
			for (int insert : ExpandArray) {
				System.out.println("Insert an Element:"+insert);
			}
		
	}
	
	public static void main(String[] args) {
		OperationsinArray obj = new OperationsinArray();
		obj.Indexing();
		obj.FLElementArray();
		obj.RandomValue();
		obj.comparison();
		obj.Appendnew();
		obj.Insert();
	}
}