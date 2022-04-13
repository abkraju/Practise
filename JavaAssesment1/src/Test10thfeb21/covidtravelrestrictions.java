package Test10thfeb21;

public interface covidtravelrestrictions {
	public void TempratureCheck();
	public void SymptomsCheck();
	public void Vaccinated();
}
	class covid implements covidtravelrestrictions {
			public void TempratureCheck()
			{
			System.out.println("Check the Temperature");	
			}
			public void SymptomsCheck()
			{
		    System.out.println("Check the Symptoms");	
			}
			public void Vaccinated()
			{
				System.out.println("Double Dose Vaccinated");	
			}
			
		
	public class Restrictions
	{
	public static void main(String[]args) {
	covid cov = new covid();
	cov.TempratureCheck();
	cov.SymptomsCheck();
	cov.Vaccinated();
	}
 }
}
