package aRRay;
import java.util.Arrays;

public class Remove {
	public static void ElementRemove() {
int[] test = new int[] { 101, 102, 103, 104, 105};

System.out.println("Original Array : size : "
                       + test.length );
System.out.println("Contents : " + Arrays.toString(test));

// let's remove or delete an element from an Array
// using Apache Commons ArrayUtils
test = ArrayUtils.remove(test, 2); //removing element at index 2

// Size of an array must be 1 less than the original array
// after deleting an element
System.out.println("Size of the array afterremoving an element  : " + test.length);
System.out.println("Content of Array afterremoving an object : " + Arrays.toString(test));

}

}




























//public class Remove {
//	private static void RemovingtheFirstElement() {
//	private static int[] removeFirstElement(int[] arr) {
//		int arr[] = {2, 4, 6, 8};
//        
//        int newArr[] = removeFirstElement(arr);
//    public static int[] removeFirstElement(int[] arr) {
//        int newArr[] = new int[arr.length - 1];
//        for (int i = 1; i < arr.length; i++) {
//            newArr[i-1] = arr[i];
//        }
//        return newArr;
//    }
// 
//    
//
//	public static void main(String[] args) {
//    	RemovingtheFirstElement();
//        
// 
//        System.out.println("Original  : " + Arrays.toString(arr));
//        System.out.println("New Array : " + Arrays.toString(newArr));
//    }
//
//	}
// 
//}


























//public class ArrayInsert {
//public static void AddElement() {
//	
//Integer arr[] = {1,2,3,4,5,6};  
//int n = arr.length;  
//int index = 3;  
//System.out.println("Original Array: "+Arrays.toString(arr));  
//Integer newArr[] = new Integer[n+1];  
//int j = 0;  
//for(int i = 0; i<newArr.length; i++) {  
//if(i==index) {  
//newArr[i] = 7;  
//}else {  
//newArr[i] = arr[j];  
//j++;  
//}  
//}  
//newArr[index] = 7;  
//  
//System.out.println("Array after adding value: "+Arrays.toString(newArr));  
//}  
//public static void main(String[] args) {
//	AddElement();
//}
//
//}


























//public class DuplicateRemoval {
//	public static void RemoveDuplicate() {
//		int[] anArray = new int[] {5, 4, 4, 3, 2, 2, 1};
//		System.out.print("Before Remove Duplicates:");
//		Arrays.sort(anArray); 
// 		for (int i = 0; i < anArray.length; i++) {
//			System.out.print(anArray[i] + "\t");
//				}
//		System.out.print("\nAfter removing duplicates:");
//		int b = 0;
//		anArray[b] = anArray[0];
//		for (int i = 0; i < anArray.length; i++) {
//			if (anArray[b] != anArray[i]) {
//				b++;
//				anArray[b] = anArray[i];
//			}
//		}
//		for (int i = 0; i <= b; i++) {
//			System.out.print(anArray[i] + "\t");
//		}
//	}
//
//	public static void main(String[] args) {
//		RemoveDuplicate();
//	}
//}
//
//
//int a[] = { 3, 2, 1, 4, 2, 1 };
//System.out.print("Before Sorting:");
//for (int i = 0; i < a.length; i++) {
//	System.out.print(a[i] + "\t");
//}
//System.out.print("\nAfter Sorting:");
////sorting the elements
//for (int i = 0; i < a.length; i++) {
//	for (int j = i; j < a.length; j++) {
//		if (a[i] > a[j]) {
//			int temp = a[i];
//			a[i] = a[j];
//			a[j] = temp;
//		}
//
//	}
//}






//public static void main(String[] args) throws CloneNotSupportedException 
//{
//    // Array with duplicate elements
//    Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
//
//    // This array has duplicate elements
//    System.out.println(Arrays.toString(origArray));
//
//    Integer[] tempArray = removeDuplicates(origArray);
//
//    // Verify the array content
//    System.out.println(Arrays.toString(tempArray));
//}
//
//private static Integer[] removeDuplicates(Integer[] origArray) {
//
//    Integer[] tempArray = new Integer[origArray.length];
//     
//    int indexJ = 0;
//    for (int indexI = 0; indexI < origArray.length - 1; indexI++) 
//    {
//        Integer currentElement = origArray[indexI];
//         
//        if (currentElement != origArray[indexI+1]) {
//            tempArray[indexJ++] = currentElement;
//        }
//    }
//     
//    tempArray[indexJ++] = origArray[origArray.length-1];
//     
//    return tempArray;
//}
//
//
//}
