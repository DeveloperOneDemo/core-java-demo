package arrays;

import classesandobjects.Room;

public class RoomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room room1 = new Room(400, 200);
		Room room2 = new Room(300, 100);
		
		// declare an array of Room of size 3
		Room[] myRooms = new Room[3];
//		myRooms[0] = new Room();
//		myRooms[1] = new Room();
//		myRooms[2] = new Room();
		
		//same as what the above three lines do
		for(int i=0; i<myRooms.length; i++) {
			myRooms[i] = new Room(40, 20);
		}
		
		int[] all = {1,2,3,4};
		//initialize an array of room objects
		Room[] allRooms = {new Room(60, 30), new Room(60, 30), new Room(80, 40), new Room(80, 40)};
		//allRooms[0].length = 200;
		//allRooms[0].breadth = 100;
	}

}
