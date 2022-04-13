package Test10thfeb21;

public class BBank extends ABank{
	int bal = 0;
	int per = 90;
	private String AccActivate;
	private String AccDeactivate;
	void AccDeactivate() {
    super.AccDeactivate();
       
    if(bal==0 && per>=90) {

	       System.out.println("Your BBank Account is AccDeactivated");
	    }
      else 
      {
		   System.out.println("Your BBank Account is AccActivate");
          }
        }
      }

