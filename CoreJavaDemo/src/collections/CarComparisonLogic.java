package collections;

import java.util.Comparator;

import classesandobjects.FordFigo;

public class CarComparisonLogic implements Comparator<FordFigo> {

	@Override
	public int compare(FordFigo o1, FordFigo o2) {
		// TODO Auto-generated method stub
		return o1.getModelNo() - o2.getModelNo();
	}

}
