package inheritance;



public class Child extends Parent {

	public static void main(String[] args) {
		int salary =50000;
		Child Ch= new Child();
		Ch.Play();
		Ch.Read();
		Ch.work();
    	Ch.watchTV();
//		Ch.wheels();
		//Ch.engine();
		//Ch.superhero();
		
		System.out.println(salary);
	}
	public void work() {
		System.out.println("Child is Working");
	}
	public void Play() {
		System.out.println("Playing");
		
	}
	public void Read() {
		System.out.println("Reading");

	}

}
