package arrays;

import classesandobjects.Room;

public class RoomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room room1 = new Room();
		Room room2 = new Room();
		
		// declare an array of Room of size 3
		Room[] myRooms = new Room[3];
//		myRooms[0] = new Room();
//		myRooms[1] = new Room();
//		myRooms[2] = new Room();
		
		//same as what the above three lines do
		for(int i=0; i<myRooms.length; i++) {
			myRooms[i] = new Room();
		}
		
		int[] all = {1,2,3,4};
		//initialize an array of room objects
		Room[] allRooms = {new Room(), new Room(), new Room(), new Room()};
		
	}

}
