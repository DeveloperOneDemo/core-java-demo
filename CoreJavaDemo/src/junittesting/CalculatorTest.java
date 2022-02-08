package junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@BeforeAll
	public static void first() {
		System.out.println("Before all method is called.");
	}
	
	@AfterAll
	public static void last() {
		System.out.println("After all method is called.");
	}
	
	@BeforeEach
	public void eachBefore() {
		System.out.println("Before each is called");
	}
	
	@AfterEach
	public void eachAfter() {
		System.out.println("After each is called");
	}
	
	@Test
	public void testAddPositive() {
		Calculator calc = new Calculator();
		int actualOutptut = calc.add(5, 7);
		
		int expectedOutput = 12;
		
		// use this if you dont want to do static imports
		//Assertions.assertEquals();
		assertEquals(expectedOutput, actualOutptut);
	}
	
	@Test
	public void testAddZero() {
		Calculator calc = new Calculator();
		int actualOutptut = calc.add(0, 0);
		int expectedOutput = 0;
		assertEquals(expectedOutput, actualOutptut);
	}
	
	@Test
	public void testAddNegative() {
		Calculator calc = new Calculator();
		int actualOutptut = calc.add(-8, -4);
		int expectedOutput = -12;
		assertEquals(expectedOutput, actualOutptut);
	}
	
	@Test
	public void testMultiplyPositive() {
		Calculator calc = new Calculator();
		int actualOutptut = calc.multiply(5, 7);
		int expectedOutput = 35;
		assertEquals(expectedOutput, actualOutptut);
	}
	
}
