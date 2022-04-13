package Test10thfeb21;

class Personal{
	private String Name;
	private int age;
	private long accnum;
	private int accbal;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
}


public class Personaldata {
	
	public static void main(String[] args) {
		Personal p= new Personal();
		p.setName("Raj");
		p.setAge(30);
		p.setAccnum(1234567891);
		p.setAccbal(909200534);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAccnum());
		System.out.println(p.getAccbal());
		
	}
}

