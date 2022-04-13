 package Samples;
 import java.util.Scanner;
    public class Fibonacciseriesprogram {
      public static void main(String[]args) {
		// TODO Auto-generated method stub
		/* 0 1 1 2 3 5 8 .....
		 * num1    = 0 1 1 
		 * num2    = 1 1 2
		 * nextNum = 1 2 3
		 * nextNum = num1+num2
		 */
		int num1 =0;
		int num2 =1;
		int nextNum ;
		int lengthOfSeriors = 5;
		System.out.println("enter the length of thr series");
		
		Scanner scanner = new Scanner(System.in);
		lengthOfSeriors = scanner.nextInt();
		scanner.close();
		
		for(int i=0;i<lengthOfSeriors;i++) {
			System.out.print(num1 + " ");
			nextNum = num1+num2;
			num1=num2;
			num2=nextNum;
			}
		  }
        }
