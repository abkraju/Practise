package aRRay;

//import java.util.Arrays;
//import java.util.ArraysList;
public class ElementsRemoveArray {
	public static void Remove() {
		int [] arr = {2,5,1,3,4,6,7};
int[] answer = new int[arr.length - 1];
int min = arr[0];
int index = 0;

if(arr.length <=1){
return;
}

for (int value : arr) {
if (min > value) {
min = value;
}
}
for(int k = 0; k<arr.length;k++){
if(arr[k] == min){
index = k;
break;
}
}

for (int i = 0, j = 0; i < arr.length; i++) {
if (i == index) {
continue;
}
answer[j++] = arr[i];
}
return;
}

	public static void main(String[] args) {
		 Remove();

	}
}










//public class ElementsRemoveArray {
//	
//	public class Main {
//		 
//	    ArrayList<Integer> arraylist =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
//	    System.out.println("Given Array List:"+arrayList);
//	    arrayList.remove(0);
//	    System.out.println("Final Array List:"+arrayList);
//	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		public static int[] removeFirstElement(int[] arr) {
//	        int newArr[] = new int[arr.length - 1];
//	        for (int i = 1; i < arr.length; i++) {
//	            newArr[i-1] = arr[i];
//	        }
//	        return newArr;
//	    }
//	 
//	    public static void main(String[] args) {
//	        int arr[] = {2, 4, 6, 8};
//	        int newArr[] = removeFirstElement(arr);
//	        System.out.println("Original  : " + Arrays.toString(arr));
//	        System.out.println("New Array : " + Arrays.toString(newArr));
//	    }
//	 
//	}
//}
	




//	//public void Element( ) { 
//		public static void main(String[] args) {
//int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//int index = 0;
//int[] copy = new int[array.length-1];
//
//for (int i = 0, j = 0; i <array.length-1; i++) {
//    if (i != index) {
//        copy[j++] = array[i];
//        System.out.println(copy[j]);
//    }  
//}
//
////	public static void main(String[] args) {
//
//	}
//}
//	


//
//
//	//A method to Get the First and Last Element of an Array
//	int arr[]= new int[] {1,2,3,4,5};
//	int size=arr.length;
//	System.out.println("First element of an array is: " + arr[0]);
//	System.out.println("Last element of an array is: " + arr[size-1]);
//	//A method to Get a Random Value from an Array
//	int[] arr1 = new int[] { 10, 30, 45, 60, 78, 99, 120, 140, 180, 200};
//    System.out.print("Random number from the array = "+arr1[new Random().nextInt(arr1.length)]);
//    //A method to Compare Two Arrays
//     boolean flag = Arrays.equals(new int[] { 45, 12, 90 }, new int[] { 45, 12, 90 });
//     System.out.println("The two int arrays are equal? " + flag);
//     //A method to Check if an Array Is Empty
//    int arr2[] = new int[0];
//     if (arr2.length == 0) {
//       System.out.println("array is empty");
//     }
//}
//       //A method to Shuffle the Elements of an Array
//       public static Byte[] box(byte[] byteArray) {
//    	    Byte[] box = new Byte[byteArray.length];
//    	    for (int i = 0; i < box.length; i++) {
//    	        box[i] = byteArray[i];
//    	    }
//    	    return box;
//    	
//       
//     }
//     
//    	   }
//    	