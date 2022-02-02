package classesandobjects;

public class Room {
	//public int length;
	int length;
	int breadth;
	//private int height;
	//static int height = 50; //  not preferred
	static int height;
	int roomNo;
	String roomColor;
	
	static {
		height = 50; // correct place to initialize static variables
	}
	
	public Room(int length, int breadth){
		// this refers to the current object
		this.length = length;
		this.breadth = breadth;
	}
	
	//CPD = Copy Paste Detecters
	//constructor overloading - a type of polymorphism
	public Room(int length, int breadth, int roomNo, String roomColor) {
//		this.length = length;
//		this.breadth = breadth;
		//constructor chaining - this()
 		this(length, breadth); // calling a constructor which takes 2 ints as arguments
		this.roomNo = roomNo;
		this.roomColor = roomColor;
	}
	
	public int calculateFloorArea() {
		int floorArea = length * breadth;
		return floorArea;
	}
	
	int calculatePaintingCost(int paintRate) {
		int wallArea = 2 * ((length * height) + (breadth * height));
		return wallArea * paintRate;
	}
	
	static int computeDoubleHeight(){
		//System.out.println(length);
		return height * 2;
	}
	
	@Override
	public String toString() {
		return "[length=" + length + ",breadth=" + breadth + "]";
	}
	
}



