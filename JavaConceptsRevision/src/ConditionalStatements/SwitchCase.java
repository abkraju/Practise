package ConditionalStatements;

public class SwitchCase {

	String hero = "Captain america";

	public void superhero() {
		switch (hero) {
		case "Iron Man":
			System.out.println("Iron Man is Super Hero");
		case "Super Man":
			System.out.println("Super Man is Super Hero");
		case "Bat Man":
			System.out.println("Bat Man is Super Hero");
		default:
			System.out.println("I Don't Know about this Person");
		}

	}

	public static void main(String[] args) {
		SwitchCase Super = new SwitchCase();
		Super.superhero();

	}

}
