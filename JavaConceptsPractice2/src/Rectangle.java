

public class Rectangle {
	 int lth ; int bth ; int Area;
	 
public void display(int x, int y) {
	 Area=x*y;
	System.out.println(Area);
}
Rectangle(int lth, int bth){
 Area=lth*bth;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of class Rectangle and assign values of the parameter used in constructor. 
		  Rectangle rt = new Rectangle(20,30);
		  System.out.println("Area: " + rt.Area); 
		   
		   //Rectangle rt1= new Rectangle();
		 rt.display(50, 50);
		 
		}
}
