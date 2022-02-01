package interfacesandabstractclasses;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal animal = new Animal(); - cannot do this as Animal is abstract
		
		Cat cat = new Cat();
		cat.breathe();
		cat.mobility();
		cat.makeSound();
		
		System.out.println("------------------");
		Snake snake = new Snake();
		snake.breathe();
		snake.mobility();
		snake.sound();
	}

}
