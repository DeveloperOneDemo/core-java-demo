package classesandobjects;

public class FordFigoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primitive type
		int mark;
		mark = 50;
		
		//derived type
		FordFigo fordFigo; // here no object is created
		fordFigo = new FordFigo(); // object is created
		
//		fordFigo.modelNo = 123456;
//		fordFigo.color = "black";
//		fordFigo.carType = "hatch back";
		
		fordFigo.setModelNo(123456);
		fordFigo.setColor("black");
		fordFigo.setCarType("hatch back");
		
		
		System.out.println("Car color: " + fordFigo.getColor());
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBreak());
		System.out.println(fordFigo.lockCar());
		
		//fordFigo = null;
		
		System.out.println("--------------------");
		FordFigo fordFigo2 = new FordFigo();
		
//		fordFigo2.modelNo = 123477;
//		fordFigo2.color = "silver";
//		fordFigo2.carType = "hatch back";
		
		fordFigo2.setModelNo(123477);
		fordFigo2.setColor("silver");
		fordFigo2.setCarType("hatch back");
				
		System.out.println("Car color: " + fordFigo2.getColor());
		System.out.println(fordFigo2.unlockCar());
		System.out.println(fordFigo2.accelerate());
		System.out.println(fordFigo2.applyBreak());
		System.out.println(fordFigo2.lockCar());
		
		
		System.out.println("------------------------");
		FordFigoTitanium titanium = new FordFigoTitanium();
		System.out.println(titanium.unlockCar());;
		System.out.println(titanium.accelerate());;
		System.out.println(titanium.applyBreak());
		System.out.println(titanium.popAirBags());
		System.out.println(titanium.lockCar());
		
		System.out.println("------------------------");
		
		FordFigo figo1 = new FordFigo();
		
		FordFigoTitanium tita1 = new FordFigoTitanium();
		
		// a parent class reference variable can point
		   //to a child class object
		// the other way around is not possible
		// with this refernce variable I can access all the members of the
			// of the super class + overriding methods in the sub class. I cannot
			// access the extra members of the child class
		FordFigo tita2 = new FordFigoTitanium(); // implicit casting
		System.out.println(tita2.unlockCar());
		System.out.println(tita2.accelerate());
		System.out.println(tita2.applyBreak());
		System.out.println(tita2.lockCar());
		// tita2.popAirBags(); -  not able to access because the reference 
									//is of type parent class 
		
		// lets cast the super class reference variable back to child class
			// type in order to access the extra member of child class
		FordFigoTitanium tita3 = (FordFigoTitanium)tita2; // explicit casting
		System.out.println(tita3.popAirBags());
	}

}
