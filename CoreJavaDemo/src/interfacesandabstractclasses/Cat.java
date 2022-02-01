package interfacesandabstractclasses;

public class Cat extends Animal {

	@Override //  Annotation
	void mobility() {
		// TODO Auto-generated method stub
		System.out.println("Cat walks!");
	}
	
	void makeSound() {
		System.out.println("Meows!");
	}

}
