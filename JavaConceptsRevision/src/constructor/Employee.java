package constructor;

public class Employee {
	int employeeid;
	String employeename;

	Employee() {
		employeeid = 1;
		employeename = "Shiva";

		System.out.println("Employee ID Created");
	}

	public static void main(String[] args) {
		Employee employee = new Employee();

	}

}
