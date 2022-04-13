package JSample;

public class Arraymethods {
	int[] totalsecA = new int[] { 100, 75, 80, 60, 50 };
	int[] totalsecB = new int[] { 55, 90, 70, 40 };
	int max = 0;

	public void findmax() {
		if (totalsecA.length > totalsecB.length) {
			max = totalsecA.length;

		} else {
			max = totalsecB.length;
		}
		System.out.println("Maximum Elements of Array:" + max);
	}

	public void maxitem() {
		for (int item = 0; item < max - 1; item++) {
			if (totalsecA[item] > totalsecB[item]) {
				System.out.println("Maximum Value of two Section:" + totalsecA[item]);
			} else {
				System.out.println("Maximum Value of two Section:" + totalsecB[item]);
			}
		}
	}

	public void mergeoddeven() {
		int[] resultArray = new int[totalsecA.length + totalsecB.length];
		for (int item = 0; item < resultArray.length; item++) {
			resultArray[item] = 
					
					(item < totalsecA.length ? totalsecA[item] : totalsecB[item - totalsecA.length]);
		}

		for (int element : resultArray) {
			System.out.println(element);
			System.out.println("Even numbers in the given array are:: ");
			for (int item = 0; item < resultArray.length; item++) {
				if (resultArray[item] % 2 == 0) {
					System.out.println(resultArray[item]);
				}
			}
			System.out.println("Odd numbers in the given array are:: ");
			for (int item = 0; item < resultArray.length; item++) {
				if (resultArray[item] % 2 != 0) {
					System.out.println(resultArray[item]);
				}
					int copyArray[] = new int[totalsecA.length];
					copyArray=totalsecA;
					System.out.println("CopyArray:" +copyArray);
					
					copyArray[0]++;
					 
			        System.out.println("Contents of totalsecA[] ");
			        for (int item1 = 0; item1 < totalsecA.length; item1++)
			            System.out.print(totalsecA[item1] + " ");
			 
			        System.out.println("\n\nContents of copyArray[] ");
			        for (int item1 = 0; item1 < copyArray.length; item1++)
			            System.out.print(copyArray[item1] + " ");
				}
			}
		}
	
			
	}






