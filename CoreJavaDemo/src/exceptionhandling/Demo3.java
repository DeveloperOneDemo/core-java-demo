package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo3 {

	public static void main(String[] args) {
		
		// a finally block is executed whether an exception is thrown or not thrown
		// finally block has closing of resources that were opened in the try block
		// a new variation of try block - try with resources
		
		//combination 2
		try {
			//open a resource
			//
			//
			//
		}catch(ArithmeticException ae) {
			//
			//
			//
			//
		}catch(NullPointerException ne) {
			//
			//
		}
		finally {
			//
			//close the resources
		}

		// combination 1
		try {
			//open a resource
			//
			//
			//
		}catch(ArithmeticException ae) {
			//
			//
			//
			//
		}catch(NullPointerException ne) {
			//
			//
		}
		
		//combination 3
		try {
			//
			//
		}finally {
			//
			//
			
		}
		
		//
		//
		
		try {
			FileInputStream fis = new FileInputStream("D:\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
// 2 categories of exceptions
// checked exception - are siblings of RUntimeException
//					 - these exceptions are handled using try catch
//					 - FileNotFoundException, IOException, SQLException
//					 - compiler enforced exception - because the compiler makes sure these exceptions are handled
// unchecked exception  - are sub classes of RuntimeException
//						- these exceptions should be programatically handled
// 						- these exception occur due to a silly mistake of the developer
//						- ArithmeticException. NullPointerException
//						- are not enforced by the compiler to be handled by try catch

// correct way to handle ArithmeticException would be
// if(num2 != 0)
//	result = num1 / num2;


// correct way to handle NullPointerException would be
// Room room = null;
// if(room != null)
// 	room.calculateFloorArea();

//correct way to handle ClassCastException would be
// Animal animal = new Dog();
// if(animal instance of Cat){
//     Cat cat = (Cat)animal; ----> will throw ClassCastException, if not checked with instance of operator
// else if(animal instance of Dog)
// 	   Dog dog = (Dog)animal;



