
public class Arthmetic  {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c = 0;
		Addition(a,b);
		sub(a,b);
		multiplication(a, b);
		Division(a, b);
		
	}

	public static void Addition(int x, int y) {
		System.out.println(" Addition:" + (x + y));

	}

	public static void sub(int x, int y) {
		System.out.println(" Sub:" +(x-y));

	}

	public static void multiplication(int x, int y) {
		System.out.println("Multiplication:" + (x * y));

	}

	public static void Division(int x, int y) {
		System.out.println("Division:" + (x / y));

	}

}
