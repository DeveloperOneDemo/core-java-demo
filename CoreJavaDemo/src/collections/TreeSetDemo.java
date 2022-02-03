package collections;

import java.util.Set;
import java.util.TreeSet;

import classesandobjects.Room;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> allNames = new TreeSet<String>();
		
		allNames.add("xyz");
		allNames.add("abc");
		allNames.add("lmn");
		allNames.add("fgh");
		
		System.out.println(allNames);
		
		// any object added to a TreeSet should implement Comparable interface 
		
		Set<Room> allRooms = new TreeSet<Room>();
		
		allRooms.add(new Room(200, 100));
		allRooms.add(new Room(500, 400));
		allRooms.add(new Room(20, 10));
		
		System.out.println(allRooms);
		
		
		
		
	}

}
