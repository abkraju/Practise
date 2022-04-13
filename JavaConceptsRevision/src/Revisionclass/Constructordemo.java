package Revisionclass;

public class Constructordemo {
	String carname;
	int wheels;
	String type;
	
	public Constructordemo() {
//		 carname="BMW";
//		 wheels=4;
	}
	
   Constructordemo(String carname, int wheels, String type) {
	System.out.println(carname);
	System.out.println(wheels);
	System.out.println(type);
	}
			
public static void main(String[] args) {
Constructordemo obj = new Constructordemo();
//	System.out.println(obj.carname);
//	System.out.println(obj.wheels);
//	System.out.println(obj.type);
	Constructordemo obj1 = new Constructordemo("TATA", 4,"Automatic");

}
}
	