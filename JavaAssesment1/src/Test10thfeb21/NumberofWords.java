package Test10thfeb21;

import java.util.Scanner;

public class NumberofWords {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
        String str;
        int c = 0;
        System.out.print("Enter a String/Sentence: ");
        str = input.nextLine();
        for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == ' ')
              c++;                      
        }
         c = c+1;   
        System.out.println("Number of words: "+c);
    }
}