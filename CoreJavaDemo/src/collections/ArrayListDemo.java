package collections;

//import java.util.*; - not recomended

import java.util.ArrayList;
import java.util.List;

import classesandobjects.Room;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Feature of list
		// indexed
		// allows duplicate values
		// maintains the order
		
		// not recomended way of creating ArrayList object
		//ArrayList myList = new ArrayList();
		
		//recomended way(without generics)
		List myList = new ArrayList();
		//List myVector = new Vector();
		
		
		String str1 = "hello";
		String str2 = "Welcome";
		Room room = new Room(200,300);
		//Integer number = new Integer(10); // new Integer() is deprecated
		Integer number = 10;
		int data = 100;
		double pi = 3.14;
		
		
		// C - Create
		myList.add(str1);
		myList.add(str2);
		myList.add(room);
		myList.add(number);
		myList.add(str1);
		myList.add(data); // Auto boxing - primitive is automically coverted to its wrapper type 
								// and vice versa
		myList.add(pi);
		
		//R - Read
		System.out.println(myList);
		System.out.println(myList.get(1));
		
		// U - Update
		
		// D - Delete
		
	}

}
