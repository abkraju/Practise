package Test10thfeb21;

public class ABank extends Bank {
	
	int bal = 0;
	int per = 30;
	private String AccActivate;
	private String AccDeactivate;
	void AccDeactivate() {
		
	      if(bal==0 && per>=30) {
	    	  
		System.out.println("Your ABank Account is AccDeactivated");
		
	       }
          else 
          {
        System.out.println("Your ABank Account is AccActivate");
	
	      }
	    }
	}
