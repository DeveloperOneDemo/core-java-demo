package scannerexamples;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java online documentation
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		System.out.println("Number enetered is : " + number);
		
		display(number);
		
		System.out.println("Do you want to continue(y/n) : ");
		char option = scan.next().charAt(0);
		System.out.println("Option entered is: " + option);
		
		
		// hello
	}
	
	public static void display(int num) {
		System.out.println(num + " is displayed in a method");
	}

}
