package constructors;

public class DefaultConstructors {
	String animal_Name;
	int animal_Type;
	public void sayaboutAnimal() {
		System.out.println("Animal Name is" + " "+ animal_Name + " AND "+ "Animal type is" + " "+ animal_Type);
	}
	public static void main(String[] args) {
		DefaultConstructors animal = new DefaultConstructors();
		animal.sayaboutAnimal();
	}

}
