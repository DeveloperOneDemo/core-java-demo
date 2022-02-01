package classesandobjects;

// java RoomDemo

// jre call RoomDemo.main(..)
public class RoomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Room room1 = new Room();//
//		room1.length = 200;
//		room1.breadth = 100;
		//room1.height = 50;
		
		Room room1 = new Room(200, 100);
	
		System.out.println("Room height: " + Room.height);
		System.out.println("Floor area : " + room1.calculateFloorArea());
		System.out.println("Painting Cost : " + room1.calculatePaintingCost(2));
		
//		Room room2 = new Room();
//		room2.length = 300;
//		room2.breadth = 150;
//		room2.height = 50;
		
		Room room2 = new Room(300, 150);
		
		System.out.println("Floor area : " + room2.calculateFloorArea());
		System.out.println("Painting Cost : " + room2.calculatePaintingCost(3));
		
		// represent 100 Rooms
		// if i create 100 rooms , in memory 100 length, 100 breadth and 100 height
				// gets created
		System.out.println("Double room height:" + Room.computeDoubleHeight());
		
		Room room3 = new Room(400, 200, 101, "red");
	}

}
