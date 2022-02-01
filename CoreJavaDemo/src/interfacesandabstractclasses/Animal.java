package interfacesandabstractclasses;


// if the class has atleast one abstract method the class 
		//in turn becomes abstract
// We cannot create an object of abstract class
// abstract classes are incomplete classes
// abstract classes are meant to be inherited
abstract public class Animal {

	void breathe() {
		System.out.println("Animal breathes");
	}
	
	//abstract methods dont have a body
	//abstract methods are declared and not defined here
	abstract void mobility();
	
}
