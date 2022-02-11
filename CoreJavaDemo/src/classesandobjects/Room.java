package classesandobjects;

//implements Comparable Interface so that we can add this object to a TreeSet
public class Room implements Comparable{
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

	//returns three possible value
	// positive number - current object is greater than the object parameter
	// zero -  both objects are equal
	// negative number - current object is lesser than the object parameter
	
	@Override
	public int compareTo(Object o) {
		int currentFA = length * breadth;
		Room incoming = (Room) o;
		int incomingFA = incoming.length * incoming.breadth;
		
		return currentFA - incomingFA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + breadth;
		result = prime * result + length;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (breadth != other.breadth)
			return false;
		if (length != other.length)
			return false;
		return true;
	}

	

	
	
}



