package serializationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("MyFile.txt");
			ObjectOutputStream oos  = new ObjectOutputStream(fos);
			
			Account acc1 = new Account(12345, "savings", 1111);
			
			oos.writeObject(acc1);
			
			System.out.println("Object written....");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
