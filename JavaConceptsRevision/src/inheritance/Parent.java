package inheritance;

public class Parent {
public int salary =40000;
	public static void main(String[] args) {
		Parent P = new Parent();
		P.work();
		P.watchTV();
		System.out.println(P.salary);
	}
		public void work() {
			System.out.println("Working");
			
		}
		public void watchTV() {
			System.out.println("Watching");
		}
	}


