package Samples;
import java.util.Scanner;
    
      public class Countthewords {
         public static void main(String[] args) {
		   // TODO Auto-generated method stub
		        System.out.println("Enter the string:");
		
       
           Scanner scanner= new Scanner(System.in);
           String s=scanner.nextLine();
           int count=1;
            
           for(int i=0; i<s.length()-1; i++){

           if( (s.charAt(i) == ' ') && (s.charAt(i+1)!=' ' )){
        	   
           count++; 
           
           }
         }
               System.out.println("Number of words in a string: "+ count);

     }
}


