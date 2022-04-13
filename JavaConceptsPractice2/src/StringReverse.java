import java.io.*;
import java.util.*;

public class StringReverse {
   public static void main(String[] args) {
      String input = "tutorialspoint";
      char[] try1 = input.toCharArray();
      
      for (int i=try1.length-1;i >= 0; i--) 
    	  {
    	  System.out.print(try1[i]);
    	  }
   }
}

//
//	public static void main(String[] args) {
//			      String string = "abcdef";
//			      String reverse = new StringBuffer(string).reverse().toString();
//			      System.out.println("\nString before reverse: "+string);
//			      System.out.println("String after reverse: "+reverse);
//			   }
//			}

//import java.io.*;
//import java.util.Scanner;
//public class ReverseString {
//
//    public static void main (String[] args) {
//       
//        String str= "Geeks", nstr="";
//        char ch;
//       
//      System.out.print("Original word: ");
//      System.out.println("Geeks"); //Example word
//       
//     for (int i=0; i<str.length(); i++)
//      {
//        ch= str.charAt(i); //extracts each character
//        nstr= ch+nstr; //adds each character in front of the existing string
//      }
//      System.out.println("Reversed word: "+ nstr);
//    }

//    	String myStr = "Hello";
//    	char result = myStr.charAt(0);
//    	System.out.println(result);
//    }
//}

//public class StringReverse {
//	public static void main (String[]args) {
//		String str="Hello", nstr="";
//		char ch;
//	
//		for(int i=0; i<str.length();i++)
//		{
//			ch=str.charAt(i);
//		nstr=ch+nstr;
//	}
//		System.out.println(nstr);	
//		
//}
//}


//import java.util.Scanner;
//
//public class StringReverse {
//
//	String reverse(String s)
//	{
//	 if(s.length() == 0)
//     	 return " ";
//  	 return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
//	}
//	public static void main(String[ ] arg)
//	{
//		StringReverse rev=new StringReverse();
//	Scanner sc=new Scanner(System.in);
//	System.out.print("Enter a string : ");
//	String  str=sc.nextLine();	
//	System.out.println("Reverse of a String  :"+rev.reverse(str));
//	}	
//}


