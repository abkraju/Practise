package Samples;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0;
		int c=0;
		try {
			c=a/b;
			}
		catch(Exception e) {
			System.out.println("Error Occurred");
			
	   }
		 System.out.println(c);
		 System.out.println("End of program");
	}

}
