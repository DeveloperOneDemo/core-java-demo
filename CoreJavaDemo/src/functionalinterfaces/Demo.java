package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Interface implemented the convention(usual) way....");
		// first way
		Operation add = new Addition();
		int answer1 = add.operate(5, 7);
		System.out.println("Answer is : " + answer1);

		Operation multiply = new Multiplication();
		int answer2 = multiply.operate(2, 8);
		System.out.println("Answer is : " + answer2);
		
		System.out.println("Interface implemented using anonymous classes.....");
		
		// do it in a different way - Anonymous classes(no name)
		
		// though we use new Operation(), we are not 
				//creating an object for the interface
		// we are creating an object of a class that 
				//implements the interface & the class has no name
		
		Operation add1 = new Operation() {
			@Override
			public int operate(int num1, int num2) {
				return num1 + num2;
			}
		};
		int answer3 = add1.operate(10, 20);
		System.out.println("Answer is : " + answer3);
		
		Operation multiply1 = new Operation() {
			@Override
			public int operate(int num1, int num2) {
				return num1 * num2;
			}
		};
		int answer4 = multiply1.operate(10, 20);
		System.out.println("Answer is : " + answer4);
		
		System.out.println("Interface implemented using Lambda expressions.....");
		
		// do it in another different way - Lambdas
		// Lambdas can be used only to implement functional interfaces
		Operation add3 = (num1, num2) -> num1 + num2;
		int answer5 = add3.operate(50, 100);
		System.out.println("Answer is : " + answer5);
		
		Operation multiply3 = (num1, num2) -> num1 * num2;
		int answer6 = multiply3.operate(50, 50);
		System.out.println("Answer is : " + answer6);
		
		System.out.println("Inbuilt Funtional Interface implemented using Lambda expressions.....");
		BiFunction<Integer, Integer, Integer> add4 = (first, second) -> first + second;
		int answer7 = add4.apply(45, 34);
		System.out.println("Answer is : " + answer7);
		
		
		// program which computes the square of a number - use lambdas
		Function<Integer, Integer> square = number -> number * number;
		int answer8 = square.apply(5);
		System.out.println("Answer is : " + answer8);
	}

}
