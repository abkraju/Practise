package Revisionclass;

public class FunctionsorMethods {

	Integer ac_num = 10000;
	String acHolderName = "Raj";
	static Long acBalance = 50000l;

	public void getBalance() {
		System.out.println("Balance :" + acBalance);
	}

	public void acHolderName() {
		System.out.println("A/c Holder Name :" + acHolderName);
	}

	public void ac_num() {
		System.out.println("A/c Number:" + ac_num);
	}

	public static void main(String[] args) {
		FunctionsorMethods account = new FunctionsorMethods();
		account.getBalance();
		account.acHolderName();
		account.ac_num();
	}
}

