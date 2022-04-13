package Test10thfeb21;
public class MainBank {
    public static void main(String[] args) {
    	ABank a = new ABank();
		a.AccDeactivate();
		
		BBank b = new BBank();
		b.AccDeactivate();
		int Accountbalance = 500;
		System.out.println("Your Bank is AccCreated");
		}

   }
