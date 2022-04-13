

public class ParentClass { 
	int x=10;
	void printA() {
		System.out.println("Parent Class");
	}
	}
class childclass extends ParentClass{

	void PrintB( ) {
	System.out.println("Child Class");
	System.out.println(x);

}
}
class ChildSubclass extends childclass{
	void PrintC() {
		System.out.println("Child Sub Class");
		System.out.println(x);
	}
	
	public class TestClass {
		
	}
	public static void main(String[] args) {
		
		ChildSubclass cc= new ChildSubclass();
		cc.printA();
		cc.PrintB();
		cc.PrintC();
	}
	}


