package collections;

import java.util.Set;
import java.util.TreeSet;

import classesandobjects.FordFigo;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FordFigo figo1 = new FordFigo(9999, "Silver", "hatch back", "Ford Figo");
		FordFigo figo2 = new FordFigo(2222, "Black", "hatch back", "Ford Figo");
		FordFigo figo3 = new FordFigo(8988, "White", "hatch back", "Ford Figo");
		
		Set<FordFigo> allCars = new TreeSet<FordFigo>(new CarComparisonLogic());
		
		allCars.add(figo1);
		allCars.add(figo2);
		allCars.add(figo3);
		
		System.out.println(allCars);
		
	}

}
