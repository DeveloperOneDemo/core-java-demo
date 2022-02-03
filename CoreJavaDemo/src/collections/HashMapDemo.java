package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a Map has a key and a value
		
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		// C - Create
		phoneBook.put("xyz", 12345);
		phoneBook.put("abc", 67890);
		phoneBook.put("asd", 24680);
		
		// R - Read
		System.out.println("Phone number of asd is : " + phoneBook.get("asd"));
		
		// take all the keys of the hashmap and put it inside a allKeys
		Set<String> allKeys = phoneBook.keySet();
		Iterator<String> itr = allKeys.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			Integer number = phoneBook.get(name);
			System.out.println("Key: " + name + " , Value: " + number);
		}
		
		// D - Delete
		phoneBook.remove("abc");
		System.out.println(phoneBook);
		
		// U - Update
		phoneBook.replace("xyz", 555555);
		System.out.println(phoneBook);
		
		
	}

}
