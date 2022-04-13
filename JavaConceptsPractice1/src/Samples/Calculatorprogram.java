package Samples;
import java.util.Scanner;

public class Calculatorprogram {

	private static Object scanner;
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a,b;
		Scanner scanner = new Scanner(System.in);
		
		    System.out.print("Enter first numbers: ");
		a= scanner.nextInt();
		
		    System.out.print("Enter second numbers: ");
		b= scanner.nextInt();
		
	char operator;
            System.out.println("\nEnter an operator(+; _; *; /):  ");
		operator =scanner.next().charAt(0);
		
	switch(operator) {
		case '+' : 
			System.out.println(a + "+" + b + " = " + (a+b));
		case '-' :
			System.out.println(a + "-" + b + " = " + (a-b));
		case '*' : 
		    System.out.println(a + "*" + b + " = " + (a*b));
		case '/' : 
     		System.out.println(a + "/" + b + " = " + (a/b));
          }
	}
}
