package collections;

import java.util.HashSet;
import java.util.Set;

import classesandobjects.FordFigo;
import classesandobjects.Room;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//features of HashSet
		// not indexed
		// does not allow duplicate values
		// does not maintain the order
		
		Set myHashSet = new HashSet();
		
		String str1 = "hello";
		String str2 = "Welcome";
		Room room = new Room(200,300);
		//Integer number = new Integer(10); // new Integer() is deprecated
		Integer number = 10;
		
		// C - create
		myHashSet.add(str1);
		myHashSet.add(str2);
		myHashSet.add(room);
		myHashSet.add(number);
		myHashSet.add(str1);
		
		// R- Read
		System.out.println(myHashSet);
		
		// U - Update
		
		// D - Delete
		
			
		Room room1 = new Room(500, 250);
		System.out.println(room1);
		
		
	}

}
