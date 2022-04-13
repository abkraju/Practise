package Samples;
public class Accountholder{
	private static String Name;
	private static int  Age;
	private static int AccountNumber;
	private static int AccountBalance;
	
	 public Accountholder(String Name,int age,int number,int abalance) {
		this.Name= Name;
        }
     public static String getName() {
		return Name;
        }
	 public static void setName(String name) {
		Name = name;
        }
     public static int getAge() {
		return Age;
	    }
     public static void setAge(int age) {
		Age = age;
	    }
     public static int getAccountNumber() {
		return AccountNumber;
	    }
     public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	    }
     public static int getAccountBalance() {
		return AccountBalance;
	    }
     public void setAccountBalance(int accountBalance) {
		AccountNumber = accountBalance;
        }
    
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountholder a= new Accountholder(Name, Age, AccountNumber, AccountBalance);
		
		
	    a.setName("Jaya");
	    a.setAge(22);
	    a.setAccountNumber(76435);
	    a.setAccountBalance(54800);
		System.out.println(Accountholder.getName());
		System.out.println(Accountholder.getAge());
		System.out.println(Accountholder.getAccountNumber());
		System.out.println(Accountholder.getAccountBalance());
       }

    }
