package Samples;


public class TestEncap {

	public static void main(String[] args) {
			
			    //creating instance of Account class  
				PersonalInfo per =new PersonalInfo();  
			    //setting values through setter methods  
			    per.setAdhar_num(756050400);  
			    per.setName("Sonoo Jaiswal");  
			    per.setDistrict("sonoojaiswal@javatpoint.com");  
			    per.setContact_num(500000);  
			    //getting values through getter methods  
			    System.out.println(per.getAdhar_num()+" "+per.getName()+" "+per.getDistrict()+" "+per.getContact_num());  
			}  
			}  
