package inheritance;


public class Child2 extends Parent {

	public static void main(String[] args) {
	int age = 21;
			Child2 Ch2= new Child2();
			Ch2.Play();
			Ch2.Read();
		    Ch2.work();
			Ch2.watchTV();
//			Ch.wheels();
			//Ch.engine();
			//Ch2.superhero();
			
		System.out.println(Ch2.salary);
		System.out.println(age);
		}
		public void Play() {
			System.out.println("Playing");
			
		}
		public void Read() {
			System.out.println("Reading");

		}


	}
