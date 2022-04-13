package aRRay;

public class CopyanArray {
		
	public static void copyanArray() {
		int[] anArray = new int[] { 100, 75, 80, 60, 50 };
		int []copyArray= new int[anArray.length];
		copyArray= anArray;
		System.out.println("Contents of anArray ");
		for (int item = 0; item < anArray.length; item++)
			System.out.print(anArray[item] + " ");
		System.out.println("\n\nContents of copyArray[] ");
		for (int item = 0; item < copyArray.length; item++)
			System.out.print(copyArray[item] + " ");
	}

	public static void main(String[] args) {
		copyanArray();
	}
}


