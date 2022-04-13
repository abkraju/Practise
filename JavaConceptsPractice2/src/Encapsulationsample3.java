

public class Encapsulationsample3 {

	
		// TODO Auto-generated method stub
		
		 private String name="Raj"; 
		 private int phyMarks=170; 
		 private int chemMarks=135; 
		 private int bioMarks=150; 

		public void setName(String name)
		{ 
		 this.name = name; 
		}
		public void setPhyMarks(int phyMarks)
		{ 
		 this.phyMarks = phyMarks; 
		} 
		public void setChemMarks(int chemMarks)
		{ 
		 this.chemMarks = chemMarks; 
		} 
		public void setBioMarks(int bioMarks)
		{ 
		 this.bioMarks = bioMarks; 
		} 
		void marksRead() 
		{ 
		 System.out.println("Student's Name: " +name); 
		 System.out.println("Marks in Physics: " +phyMarks); 
		 System.out.println("Marks in Chemistry: " +chemMarks); 
		 System.out.println("Marks in Biology: " +bioMarks); 

		 int Totalmarks = phyMarks + chemMarks + bioMarks; 
		 float percentage = (Totalmarks * 100)/300; 
		System.out.println("Percentage of PCB: " +percentage); 
		 
		}
		
		public static void main(String[] args) 
		{ 
			Encapsulationsample3 st = new Encapsulationsample3(); 
			st.marksRead();
			System.out.println("---------");
		 st.setName("Vivek"); 
		 st.setPhyMarks(85); 
		 st.setChemMarks(75); 
		 st.setBioMarks(90); 
		 st.marksRead(); 
		 
	
	}
}
