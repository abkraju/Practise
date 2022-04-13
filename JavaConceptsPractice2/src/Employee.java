

public class Employee {

	private int empId;
	private String empName;
	private String desg;
	public void display() {
		
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(desg);
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	Employee(){
		
		empId=1;
		empName="XYZ";
		desg="ABC";
	}
	
	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.display();
		//System.out.println(emp.empId);
//emp.setEmpName("rst");
System.out.println(emp.getDesg());
System.out.println(emp.getEmpName());

	}
	}

	

