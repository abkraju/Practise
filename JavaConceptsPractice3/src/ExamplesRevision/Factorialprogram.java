package ExamplesRevision;

import java.util.Scanner;

public class Factorialprogram {
			    
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        int n = scanner.nextInt();
        
        int result = factorial(n);
        System.out.println(n + " factorial = " + result);
    }
}