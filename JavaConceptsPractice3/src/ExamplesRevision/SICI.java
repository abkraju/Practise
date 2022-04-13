package ExamplesRevision;
import java.util.Scanner;

public class SICI{
		static Scanner input = new Scanner(System.in);
		void interest(int p, int t, double r, double a) {
	    System.out.println("Simple Interest:"+ (p * t * r) / 100);
		}
		public void interest(double p, int t, double r, double a) {
			// TODO Auto-generated method stub
			
		}
}
@SuppressWarnings("unused")
class Compound extends Simple {
		public static int t;
		public static double r;
		public static double a;
		void interest(int p, int t, double r, double a) {
		super.interest(p, t, r, a);
	    System.out.println("Compound Interest:"+ (float) (p *(Math.pow((1 + r / 100), t))));
		}
	 public class Simple_Compound_program {
	 @SuppressWarnings("null")
	public static void main(String[]args) {
		Compound sc = new Compound();
		
		Simple compound = null;
		compound.interest(p, t, r, a);
		{
		System.out.print("Enter the principal: " );
	 }
	 }
		@SuppressWarnings("unused")
		static double p = input.nextDouble();{

		System.out.print("Enter the rate: " );
		@SuppressWarnings("unused")
		double r = input.nextDouble();
		System.out.print("Enter the time: " );
		double t =input.nextDouble();
		    	    
		}
}
}

public class SICI {

}
