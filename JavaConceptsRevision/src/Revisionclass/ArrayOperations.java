package Revisionclass;
import java.util.ArrayList;
public class ArrayOperations {
	int[] anArray=new int[]{};
	int size;
	public void Indexing() {
		anArray[0]=1;
		anArray[1]=2;
		anArray[2]=3;
		anArray[3]=4;
		anArray[4]=5;
		System.out.println("Display the Array:"+anArray);
	}
	
	public void FLElementArray() {
		
		size=anArray.length;
		System.out.println("First Element of an Array:"+anArray[0]);
		System.out.println("Last Element of an Array:"+anArray[size-1]);
				
	}
	
	public static void main(String[] args) {
		ArrayOperations obj = new ArrayOperations();
		obj.Indexing();
		obj.FLElementArray();
		

	}

}
	
