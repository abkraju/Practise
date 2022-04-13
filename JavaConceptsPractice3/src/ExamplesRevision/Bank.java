package ExamplesRevision;

public class Bank {

	public static void main(String[] args) {
		class BankAccount_A{
			
			int b = 1;
			int p = 1000;
			
			void account_Deactivate() {
				
				if(b==0 && p>=30) {
					
					System.out.println("Your account is De_activated");
				}
				else {
					
					System.out.println("Your account is active");
				}
			}
		}

		class BankAccount_B extends BankAccount_A{
			
		void account_Deactivate() {
			
			super.account_Deactivate();
				
				if(b==0 && p>=30) {
					
					System.out.println("Your account is De_activated");
				}
				else {
					
					System.out.println("Your account is active");
				}
			}
		}

	class Bank_Account_Class {

			public static void main(String[] args) {
				
				BankAccount_B b = new BankAccount_B();
				b.account_Deactivate();
			}

		}
	}
}