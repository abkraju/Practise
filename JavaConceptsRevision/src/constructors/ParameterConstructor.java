package constructors;

public class ParameterConstructor 
{
	String animal_Name;
	String animal_Type;

	ParameterConstructor(String name, String type){
		this.animal_Name=name;
		this.animal_Type=type;
	}
public void sayaboutAnimal() {
	System.out.println("Animal Name is:"  + animal_Name + "Animal Type is:" + animal_Type);
}
	public static void main(String[] args) {
		ParameterConstructor PetAnimal = new ParameterConstructor("Duk", "Omniverse");
		PetAnimal.sayaboutAnimal();

	}
}
