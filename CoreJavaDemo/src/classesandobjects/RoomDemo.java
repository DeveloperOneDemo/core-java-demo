package classesandobjects;

public class RoomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room1 = new Room();
		room1.length = 200;
		room1.breadth = 100;
		room1.height = 50;
		
		System.out.println("Floor area : " + room1.calculateFloorArea());
		System.out.println("Painting Cost : " + room1.calculatePaintingCost(2));
		
		Room room2 = new Room();
		room2.length = 300;
		room2.breadth = 150;
		room2.height = 50;
		
		System.out.println("Floor area : " + room2.calculateFloorArea());
		System.out.println("Painting Cost : " + room2.calculatePaintingCost(3));
		
	}

}
