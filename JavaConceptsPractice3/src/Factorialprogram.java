
public class Factorialprogram {
	//using Recursion
	/*n 5 4 3  2 1 0
	 * 5*fact(4)
	 * 5*4*fact(3)
	 * 5*4*3*fact(2)
	 * 5*4*3*2*fact(1)
	 * 5*4*3*2*1fact(0)
	 * 5*4*3*2*1*1
	 * 
	*/
		static int fact(int n) {
			if(n==0)
				return 1;
			return n*fact(n-1);
		}
		public static void main(String[]args) {
			int n=5;
			System.out.print(fact(n));
		
		}

}

