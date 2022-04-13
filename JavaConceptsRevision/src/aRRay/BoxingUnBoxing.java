package aRRay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class BoxingUnBoxing {
	public static void BoxUnBox() {

		ArrayList<Integer> data = new ArrayList<Integer>();

		// Autoboxing used here to create Integer objects
		data.add(1);
		data.add(3);
		data.add(17);
		data.add(29);

		int sum = 0;
		for (Integer val : data)
			sum += val; // Unboxing used here to extract the ints

		System.out.print("sum = " + sum);
		System.out.println();
	}

	public static void main(String[] args) {
		BoxUnBox();
	}

}
