package ConditionalStatements;

public class IfElse {
	boolean iscupEmpty = false;

	public static void main(String[] args) {
		IfElse coffee = new IfElse();
		if (coffee.iscupEmpty) {
			System.out.println("Please Fill the Cup");
		} else
			System.out.println("Please Drink the Coffee");
	}

}
