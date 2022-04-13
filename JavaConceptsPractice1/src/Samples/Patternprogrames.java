package Samples;

public class Patternprogrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int n=5;
		int i,j;
		
		for(i=1;i<=n;i++) {
	   
		for(j=1;j<=n;j++) {
	   
		if(j==1 || j==n ||i==1 || i==n) 
		System.out.printf("* ");
		else 
		
	    System.out.printf("  ");
		
	   }		
		System.out.printf("\n");
		}
	}
}
