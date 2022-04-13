package Samples;
import java.util.Scanner;
  public class Palindromeprogram {
    public static void main(String[]args) {
		// TODO Auto-generated method stub
		/* 131 == 131
		 * 156 651
		 * 131%10 =1
		 * 131/10 =3
		 * Tempt  =0
		 * check  =0
		 * Tempt  =number%10           131%10         1       13%10
		 * check  =(check*10)+tempt    (0*10)+1       1       (1*10)
		 * number =number/10           131/10         13       13/10
		 */
		   System.out.println("Enter the number to check");
		   
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		int original = number;
		int check=0;
		int tempt=0;
		
		while(number>0) {
			tempt=number%10;
			check = (check*10)+tempt;
			number = number/10;
		}
		
		if(original == check)
			System.out.println("it is a palindrome");
		
		else
			System.out.println("it is not a palindrome");
	}
  }
