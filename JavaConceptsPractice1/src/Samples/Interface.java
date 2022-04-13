package Samples;
	
 class Restriction{
	void covidtravelrestriction() {
		}
}
class Temprature extends Restriction{
	 void covidtravelrestriction() {
	     System.out.println("The Temprature is normal for him");
	 }
}
  class Symptoms extends Restriction{
	 void covidtravelrestriction() {
		System.out.println("He has no symptoms of corona"); 
	 }
}
 class Vaccinated extends Restriction{
	 void covidtravelrestriction() {
		 System.out.println("He was Vaccinated");	 
  }
}

class Covid{
	 void check(Restriction r) {
	 System.out.println("Checking");
	 r.covidtravelrestriction();
	 }
}
  public class Interface{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covid c = new Covid();
		Temprature t = new Temprature();
		Symptoms s = new Symptoms();
		Vaccinated v = new Vaccinated();
		c.check(t);
		c.check(s);
		c.check(v);
		}
}


