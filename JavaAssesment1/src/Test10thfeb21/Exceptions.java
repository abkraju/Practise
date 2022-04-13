package Test10thfeb21;

public class Exceptions {

	public static void main(String[] args) {
		  int a,b;
          a=10;
          b=0;
          int c=0;
      try {
        	  c=a/b;
          }
      catch(Exception ae) {
    	  ae.getMessage();
    	  System.out.println("ae");    
	  }
 
          System.out.println(c);
          System.out.println("This code will work for sure");
    }
}