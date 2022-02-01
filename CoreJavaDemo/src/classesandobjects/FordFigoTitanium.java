package classesandobjects;

public class FordFigoTitanium extends FordFigo{

	String popAirBags() {
		return "airbags are popped";
	}
	
	String applyBreak() {
		//super.applyBreak(); // used to call the overridden method 
								// of the parent class
							// it has to be the first line
		return "ABS Break applied";
	}
}
